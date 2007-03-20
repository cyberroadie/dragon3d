package net.transformatorhuis.xsd;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
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
public class DisplayTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(DisplayTest.class); 

    private String testFragment = "<display name=\"swordMesh.tif\" type=\"file\" mode=\"rgba\" />";

    @Test
    public void DisplayTest() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testFragment);
        logger.debug(docFromString.toString());
        
        // TODO: Validate against XSD

        // Create JAXB
        RiDisplay display = new RiDisplay("\"swordMesh.tif\" \"file\" \"rgba\"");
        Document docFromJAXB = getDOMFromJAXB(display.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));
        
    }

}
