package net.transformatorhuis.xsd;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.DetailedDiff;

import org.w3c.dom.*;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.dom.DOMSource;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

/**
 * User: cyberroadie
 */
public class GeneralRibTest implements ErrorHandler {

    private Marshaller m;

    private ObjectFactory objFactory;

    protected Rib rib;

    private List ribList;

    private String documentFragment;

    private static Logger logger = Logger.getLogger(GeneralRibTest.class);

    static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
    static final String JAXP_SCHEMA_SOURCE = "http://java.sun.com/xml/jaxp/properties/schemaSource";

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
        JAXBContext jc = JAXBContext.newInstance("net.transformatorhuis.xsd");
        m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        objFactory = new ObjectFactory();

        // Intial setup renderman file
        rib = objFactory.createRib();
        rib.setVersion("3.03");
        ribList = rib.getWorldOrDisplayOrAttributestack();
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

    /**
     * Creates DOM document fragment from string
     * @param documentFragment
     * @return DOM Document containing XML fragment
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public Document createDOMFragmentFromString(String documentFragment) throws ParserConfigurationException, IOException, SAXException {

        // Assign this for logging purposes in case of junit test error
        this.documentFragment = documentFragment;
        
        String[] schemas = {"\"http://svn.berlios.de/svnroot/repos/dragon3d/Dragon3D/trunk/src/main/xsd/xrib_teapot.xsd?op=file&rev=0&sc=0\""};
        /* Create empty xml document */
        DocumentBuilderFactory docBuilderFac = DocumentBuilderFactory.newInstance();
        docBuilderFac.setAttribute(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
        docBuilderFac.setAttribute(JAXP_SCHEMA_SOURCE, schemas );
        // TODO make this validating work (RIDisplay has wrong xml as an example)
        docBuilderFac.setValidating(true);

        DocumentBuilder docBuilder = docBuilderFac.newDocumentBuilder();
        docBuilder.setErrorHandler(this);
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
        for (int i = 0; i < nl.getLength(); i++) {
            Attr attr = (Attr) nl.item(i);
            // Set namespace =  null to specificly not have a namespace
            nsElement.setAttributeNS(null, attr.getName(), attr.getValue());
            //nsElement.setAttribute(attr.getName(), attr.getValue());
        }

        root.appendChild(nsElement);
        ribDoc.appendChild(root);

        return ribDoc;
    }

    /**
     * Adds rib element to ribList
     * @param ribElement
     */
    protected void addRibElement(Object ribElement) {
        ribList.add(ribElement);
    }

    /**
     * Prints JAXB to System.out
     * @throws JAXBException
     */
    protected void toSystemOut() throws JAXBException {
        m.marshal(rib, System.out);
    }

    /**
     * Only compares the child nodes of <rib>
     *
     * @param controlDoc
     * @param testDoc
     * @return
     */
    public boolean diffDocuments(Document controlDoc, Document testDoc) {

        DetailedDiff diff = new DetailedDiff(new Diff(controlDoc, testDoc));

        boolean isDocumentEqual = diff.identical();

        // Print result if not equal
        if(!isDocumentEqual) {
            printDiffResults(diff);
        }

        return isDocumentEqual;

    }

    /**
     * Prints differnces between compared XML fragments
     * @param diff
     */
    public void printDiffResults(Diff diff) {

        StringBuffer sb = diff.appendMessage(new StringBuffer());

        System.out.println(documentFragment);
        System.out.println(sb.toString());

    }

    public void warning(SAXParseException saxParseException) throws SAXException {
        logger.error(saxParseException.getMessage());
        fail();
    }

    public void error(SAXParseException saxParseException) throws SAXException {
        logger.error(saxParseException.getMessage());
        fail();

    }

    public void fatalError(SAXParseException saxParseException) throws SAXException {
        logger.error(saxParseException.getMessage());
        fail();

    }
    
}
