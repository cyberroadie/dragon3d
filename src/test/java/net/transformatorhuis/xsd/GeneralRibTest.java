package net.transformatorhuis.xsd;

import org.junit.Before;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import net.transformatorhuis.xsd.ObjectFactory;
import net.transformatorhuis.xsd.Rib;
import net.transformatorhuis.teapot.BrokenTeapotException;

import java.util.List;
import java.io.StringReader;
import java.io.IOException;

/**
 * User: cyberroadie
 */
public class GeneralRibTest {

    /**
     * JAXB context.
     */
    private JAXBContext jc;

    private Marshaller m;

    private ObjectFactory objFactory;

    protected Rib rib;

    private List ribList;

    private static Logger logger = Logger.getLogger(GeneralRibTest.class);

    /**
     * Root element.
     */
    private Element root;

    private String xmlFragment;

    /**
     * DOM document
     */
    protected Document ribDoc;

    @Before
    public void setupLogging() {
        BasicConfigurator.configure();
    }
    
    public Document getDOMFromJAXB(Object jaxbNode) throws JAXBException, ParserConfigurationException, IOException, SAXException {

        /* First create the JAXB container */
        jc = JAXBContext.newInstance("net.transformatorhuis.xsd");
        m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        objFactory = new ObjectFactory();

        // Intial setup renderman file
        rib = objFactory.createRib();
        rib.setVersion("3.03");
        ribList = rib.getDisplayOrProjectionOrRotate();
        ribList.add(jaxbNode);

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = null;
        Document doc = null;
        db = dbf.newDocumentBuilder();
        doc = db.newDocument();
        m.marshal(rib, doc);
       
        return doc;

    }

    public Document getDOMDocument(String documentFragment) throws ParserConfigurationException, IOException, SAXException {
        /* Create empty xml document */
        DocumentBuilderFactory docBuilderFac = DocumentBuilderFactory.newInstance();

        DocumentBuilder docBuilder = docBuilderFac.newDocumentBuilder();
        ribDoc = docBuilder.newDocument();

        root = ribDoc.createElementNS("http://dragon3d.berlios.de/rib/", "rib");
        root.setAttribute("version", "3.03");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document d = factory.newDocumentBuilder().parse(
                new InputSource(new StringReader(documentFragment)));

        // Import the nodes of the new document into doc so that they
        // will be compatible with doc
        Node node = ribDoc.importNode(d.getDocumentElement(), true);

        // Work around to add namespace URI
        NamedNodeMap nl = node.getAttributes();

        // Create element with same name
        Element nsElement = ribDoc.createElementNS("http://dragon3d.berlios.de/rib/", node.getNodeName());

        // Copy all attributes
        for(int i = 0; i < nl.getLength() ; i++)   {
            Attr attr = (Attr) nl.item(i);
            nsElement.setAttributeNS(null, attr.getName(), attr.getValue());
            //nsElement.setAttribute(attr.getName(), attr.getValue());
        }

        root.appendChild(nsElement);
        ribDoc.appendChild(root);

        return ribDoc;
    }

    protected void addRibElement(Object ribElement) {
        ribList.add(ribElement);
    }

    protected void toSystemOut() throws JAXBException {
        m.marshal(rib, System.out);
    }

    /**
     * Only compares the child nodes of <rib>
     * @param docLeft
     * @param docRight
     * @return
     */
    public boolean compareDocuments(Document docLeft, Document docRight) {

        // normalization can affect equality
        docLeft.normalizeDocument();
        docRight.normalizeDocument();
        
        Node leftRibNode = docLeft.getFirstChild();
        Node rightRibNode = docRight.getFirstChild();

        Node leftNode = leftRibNode.getFirstChild();
        logger.debug("Left node: " + leftNode.getNodeName());

        Node rightNode = rightRibNode.getFirstChild();
        logger.debug("Right node: " + rightNode.getNodeName());

        // normalization can affect equality
        leftNode.normalize();
        rightNode.normalize();
        
        return leftNode.isEqualNode(rightNode);
        
    }
}
