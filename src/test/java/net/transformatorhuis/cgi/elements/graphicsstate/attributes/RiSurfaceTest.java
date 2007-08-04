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
 * RiSurface Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiSurfaceTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiSurfaceTest.class);

    private String testUtahTeapotRIBFragment = "Surface \"plastic\"";

    private String testUtahTeapotXMLFragment = "<surface shadername=\"plastic\"/>";

    private String testRISpecRIBFragment = "Surface \"wood\" \"roughness\" 0.3 \"kd\" 1.0 \"float ringwidth\" 0.25";

    private String testRISpecXMLFragment = "<surface shadername=\"wood\">" +
                                           "    <param name=\"roughness\" value=\"0.3\" />" +
                                           "    <param name=\"kd\" value=\"1.0\" />" +
                                           "    <param name=\"float ringwidth\" value=\"0.25\" />";                                           

    public RiSurfaceTest() {
        super();     
    }

    @Ignore
    @Test
    public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testUtahTeapotXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiSurface rib = new RiSurface(testUtahTeapotRIBFragment);
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
         RiSurface rib = new RiSurface(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

     }

}
