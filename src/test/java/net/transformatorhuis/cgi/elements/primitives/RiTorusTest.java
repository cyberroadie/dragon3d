package net.transformatorhuis.cgi.elements.primitives;

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
 * RiTorus Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 *
 * RISpec 3.2 page 83
 */
public class RiTorusTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiTorusTest.class);

    private String testXMLFragment = "";

    private String testRIBFragment = "";

    public RiTorusTest() {
        super();     
    }

    @Ignore
    @Test
     public void testGetJAXBNode() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiTorus rib = new RiTorus(testRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

     }
    
}
