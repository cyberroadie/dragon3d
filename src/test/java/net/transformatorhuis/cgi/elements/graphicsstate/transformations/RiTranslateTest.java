package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

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
 * RiTranslate Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiTranslateTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiTranslateTest.class);

    private String testUtahTeapotRIBFragment1 = "Translate 0 0 25";
    
    private String testUtahTeapotXMLFragment1 = "<translate dx=\"0\" dy=\"0\" dz=\"25\"/>";

    private String testUtahTeapotRIBFragment2 = "Translate -4.3 4.2 0";

    private String testUtahTeapotXMLFragment2 = "<translate dx=\"-4.3\" dy=\"4.2\" dz=\"0\"/>";

    private String testRISpecRIBFragment = "Translate 0 1 0";

    private String testRISpecXMLFragment = "<translate dx=\"0\" dy=\"1\" dz=\"0\"/>";
                                                                                         
    public RiTranslateTest() {
        super();     
    }

     @Ignore
     @Test
     public void testUtahTeapot1() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testUtahTeapotXMLFragment1);
         logger.info(docFromString.toString());

         // Create JAXB
         RiTranslate rib = new RiTranslate(testUtahTeapotRIBFragment1);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

     }

    @Ignore
    @Test
    public void testUtahTeapot2() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testUtahTeapotXMLFragment2);
        logger.info(docFromString.toString());

        // Create JAXB
        RiTranslate rib = new RiTranslate(testUtahTeapotRIBFragment2);
        Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

    @Ignore
    @Test
    public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testRISpecXMLFragment);
        logger.info(docFromString.toString());

        // Create JAXB
        RiTranslate rib = new RiTranslate(testRISpecRIBFragment);
        Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

}
