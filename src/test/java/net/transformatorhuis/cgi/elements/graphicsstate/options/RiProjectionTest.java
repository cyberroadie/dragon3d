package net.transformatorhuis.cgi.elements.graphicsstate.options;

import net.transformatorhuis.xsd.GeneralRibTest;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertTrue;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * @author cyberroadie
 */
public class RiProjectionTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiProjectionTest.class);

    private String testUtahTeapotRIBFragment = "\"perspective\" \"fov\" 30";

    private String testUtahTeapotXMLFragment = "<projection name=\"perspective\">" +
                                               "   <param name=\"fov\" value=\"30\">" +
                                               "</projection>";

    private String testRISpecRIBFragment1 = "orthographic";

    private String testRISPecXMLFragment1 = "<projection name=\"orthographic\"/>";

    private String testRISpecRIBFragment2 = "perspective";

    private String testRISPecXMLFragment2 = "<projection name=\"perspective\" >" +
                                            "   <param name=\"fov\" value=\"45\">" +
                                            "</projection>";

    @Ignore
    @Test
    public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testUtahTeapotXMLFragment);
        logger.info(docFromString.toString());

        // Create JAXB
        RiProjection projection = new RiProjection(testUtahTeapotRIBFragment);
        Document docFromJAXB = getDOMFromJAXB(projection.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

    @Ignore
    @Test
    public void testRISpecExample1() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testRISPecXMLFragment1);
        logger.info(docFromString.toString());

        // Create JAXB
        RiProjection projection = new RiProjection(testRISpecRIBFragment1);
        Document docFromJAXB = getDOMFromJAXB(projection.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

    @Ignore
    @Test
    public void testRISpecExample2() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testRISPecXMLFragment2);
        logger.info(docFromString.toString());

        // Create JAXB
        RiProjection projection = new RiProjection(testRISpecRIBFragment2);
        Document docFromJAXB = getDOMFromJAXB(projection.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

}
