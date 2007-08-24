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
 * RiRotate Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiRotateTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiRotateTest.class);

    private String testUtaheTeapotRIBFragment = "Rotate -22 1 0 0";

    private String testUtaheTeapotXMLFragment = "<rotate angle=\"-22.0\" dx=\"1.0\" dy=\"0.0\" dz=\"0.0\"/>";

    private String testRISpecRIBFragment = "Rotate 90.0 0.0 1.0 0.0";

    private String testRISpecXMLFragment = "<rotate angle=\"90.0\" dx=\"0.0\" dy=\"1.0\" dz=\"0.0\"/>";

    public RiRotateTest() {
        super();     
    }

    @Test
    public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testUtaheTeapotXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiRotate rib = new RiRotate(testUtaheTeapotRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

    }

    @Test
    public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiRotate rib = new RiRotate(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

    }

}
