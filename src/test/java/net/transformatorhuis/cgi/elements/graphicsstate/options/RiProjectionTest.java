package net.transformatorhuis.cgi.elements.graphicsstate.options;

import net.transformatorhuis.xsd.GeneralRibTest;
import org.apache.log4j.Logger;
import org.junit.Test;
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

    private String testFragment = "<projection name=\"perspective\"/>";

    private String testRIBFragment = "\"perspective\"";

    @Test
    public void testGetJAXBNode() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testFragment);
        logger.info(docFromString.toString());

        // Create JAXB
        RiProjection projection = new RiProjection(testRIBFragment);
        Document docFromJAXB = getDOMFromJAXB(projection.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }
}
