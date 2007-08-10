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
 * RiCylinder Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiCylinderTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiCylinderTest.class);

    private String testUtahTeapotRIBFragment = "Cylinder .26 0 3.3 360";

    private String testUtahTeapotXMLFragment = "<cylinder radius=\"0.26\" zmin=\"0\" zmax=\"3.3\" thetamax=\"360\"/>";

    private String testRISpecRIBFragment = "Cylinder .5 .2 1 360";

    private String testRISpecXMLFragment = "<cylinder radius=\"0.5\" zmin=\"0.2\" zmax=\"1\" thetamax=\"360\"/>";

    public RiCylinderTest() {
        super();     
    }

    @Ignore
    @Test
     public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testUtahTeapotXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiCylinder rib = new RiCylinder(testUtahTeapotRIBFragment);
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
         RiCylinder rib = new RiCylinder(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

     }

}
