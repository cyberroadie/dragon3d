package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

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
 * RiOrientation Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiOrientationTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiOrientationTest.class);

    private String testUtahTeapotRIBFragment = "Orientation \"rh\"";
    
    private String testUtahTeapotXMLFragment = "<orientation orientation=\"rh\"/>";

    private String testRISpecRIBFragment = "Orientation \"lh\"";

    private String testRISpecXMLFragment = "<orientation orientation=\"lh\"/>";

    public RiOrientationTest() {
        super();     
    }

    @Test
    public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testUtahTeapotXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiOrientation rib = new RiOrientation(testUtahTeapotRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

    }

    @Test
    public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiOrientation rib = new RiOrientation(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

    }

}
