package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertTrue;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.apache.log4j.Logger;
import net.transformatorhuis.xsd.GeneralRibTest;
import net.transformatorhuis.cgi.elements.graphicsstate.options.RiDisplay;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * User: cyberroadie
 */
public class RiDisplayTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiDisplayTest.class);

    private String testUtahTeapotRIBFragment = "\"swordMesh.tif\" \"file\" \"rgba\"";
    
    private String testUtahTeapotXMLFragment = "<display name=\"swordMesh.tif\" type=\"file\" mode=\"rgba\" />";

    private String testRISpecRIBFragment = "\"pixar0\" \"framebuffer\" \"rgba\" \"origin\" [10 10]";

    private String testRISpecXMLFragment = "<display name=\"pixar0\" type=\"framebuffer\" mode=\"rgba\" >" +
                                           "    <param name=\"origin\" value=\"[10 10]/>" +
                                           "</display>";
    
    @Test
    public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testUtahTeapotXMLFragment);
        logger.info(docFromString.toString());

        // Create JAXB
        RiDisplay display = new RiDisplay(testUtahTeapotRIBFragment);
        Document docFromJAXB = getDOMFromJAXB(display.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

    @Ignore
    @Test
    public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testRISpecXMLFragment);
        logger.info(docFromString.toString());

        // Create JAXB
        RiDisplay display = new RiDisplay(testRISpecRIBFragment);
        Document docFromJAXB = getDOMFromJAXB(display.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

}
