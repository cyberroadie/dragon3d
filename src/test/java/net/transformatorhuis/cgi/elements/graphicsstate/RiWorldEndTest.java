package net.transformatorhuis.cgi.elements.graphicsstate;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;
import net.transformatorhuis.xsd.GeneralRibTest;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * RiWorldEnd Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiWorldEndTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiWorldEndTest.class);

    private String testRISpecRIBFragment = "WorldEnd";

    private String testRISpecXMLFragment = "<world/>";

    public RiWorldEndTest() {
        super();     
    }

     @Ignore
     @Test
     public void testGetJAXBNode() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiWorldEnd rib = new RiWorldEnd(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

     }
    
}
