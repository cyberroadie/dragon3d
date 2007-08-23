package net.transformatorhuis.cgi.elements.graphicsstate;

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
 * RiAttribute Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiAttributeTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiAttributeTest.class);

    private String testRISpecRIBFragment = "Attribute \"displacementbound\" \"sphere\" [2.0]";

    private String testRISpecXMLFragment = "<attribute name=\"displacementbound\" >" +
                                           "    <param name=\"sphere\" value=\"[2.0]\" />" +
                                           "</attribute>";

    public RiAttributeTest() {
        super();     
    }

    @Test
     public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiAttribute rib = new RiAttribute(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

     }
    
}
