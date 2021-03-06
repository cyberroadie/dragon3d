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
 */
public class RiTorusTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiTorusTest.class);

    private String testUtahTeapotRIBFragment = "Torus 2.9 .26 0 360 90";
    
    private String testUtahTeapotXMLFragment = "<torus majorradius=\"2.9\" minorradius=\"0.26\" phiminus=\"0.0\" phimax=\"360.0\" thetamax=\"90.0\"/>";

    private String testRISpecRIBFragment = "Torus 1 .3 60 90 360";

    private String testRISpecXMLFragment = "<torus majorradius=\"1.0\" minorradius=\"0.3\" phiminus=\"60.0\" phimax=\"90.0\" thetamax=\"360.0\"/>";

    public RiTorusTest() {
        super();     
    }

    @Test
     public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testUtahTeapotXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiTorus rib = new RiTorus(testUtahTeapotRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

     }

    @Test
     public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiTorus rib = new RiTorus(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

     }
}
