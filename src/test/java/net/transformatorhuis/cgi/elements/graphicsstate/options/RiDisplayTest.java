package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.junit.Test;
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

    private String testFragment = "<display knol=\"lala\" name=\"swordMesh.tif\" type=\"file\" mode=\"rgba\" />";

    private String testRIBFragment = "\"swordMesh.tif\" \"file\" \"rgba\"";

    @Test
    public void testGetJAXBNode() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testFragment);
        logger.info(docFromString.toString());

        // Create JAXB
        RiDisplay display = new RiDisplay(testRIBFragment);
        Document docFromJAXB = getDOMFromJAXB(display.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

}
