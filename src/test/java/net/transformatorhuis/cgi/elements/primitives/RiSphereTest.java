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
 * RiSphere Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiSphereTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiSphereTest.class);

    private String testUtahTeapotRIBFragment = "Sphere 5 0 3.12897569 360";

    private String testUtahTeapotXMLFragment = "<sphere radius=\"5\" zmin=\"0\" zmax=\"3.12897569\" thetamax=\"360\"/>";

    private String testRISpecRIBFragment = "Sphere 0.5 0.0 0.5 360.0";

    private String testRISpecXMLFragment = "<sphere radius=\"0.5\" zmin=\"0.0\" zmax=\"0.5\" thetamax=\"360\"/>";

    public RiSphereTest() {
        super();     
    }

    @Ignore
    @Test
     public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testUtahTeapotXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiSphere rib = new RiSphere(testUtahTeapotRIBFragment);
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
         RiSphere rib = new RiSphere(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

}
