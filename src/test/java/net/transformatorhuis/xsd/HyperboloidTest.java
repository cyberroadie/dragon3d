package net.transformatorhuis.xsd;

import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.bind.JAXBException;
import java.io.IOException;

import net.transformatorhuis.cgi.elements.primitives.RiHyperboloid;

/**
 * @author cyberroadie
 */
public class HyperboloidTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(HyperboloidTest.class);

    private String testFragment = "<hyperboloid thetamax=\"360\" x1=\"1.2\" y1=\"0\" z1=\"0\" x2=\"0.4\" y2=\"0\" z2=\"5.7\"/>";
    
    @Test
    public void HyperboloidTest() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testFragment);
        logger.debug(docFromString.toString());

        // TODO: Validate against XSD

        // Create JAXB
        RiHyperboloid hyperboloid = new RiHyperboloid("360 1.2 0 0 0.4 0 5.7");
        Document docFromJAXB = getDOMFromJAXB(hyperboloid.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

}
