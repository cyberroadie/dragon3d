package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;
import net.transformatorhuis.xsd.GeneralRibTest;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * RiScale Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiScaleTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiScaleTest.class);

    private String testXMLFragment = "";

    private String testRIBFragment = "";

    public RiScaleTest() {
        super();     
    }

     @Test
     public void testGetJAXBNode() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiScale rib = new RiScale(testRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

     }
    
}
