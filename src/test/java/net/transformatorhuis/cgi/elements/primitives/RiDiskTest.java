package net.transformatorhuis.cgi.elements.primitives;

import net.transformatorhuis.xsd.GeneralRibTest;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created by:
 * User: cyberroadie
 * Date: Aug 10, 2007
 * Time: 6:36:01 PM
 */
public class RiDiskTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiTorusTest.class);

    private String testUtahTeapotRIBFragment = "Disk 0.225 0.75 360";

    private String testUtahTeapotXMLFragment = "<disk height=\"0.225\" radius=\"0.75\" thetamax=\"360.0\"/>";

    private String testRISpecRIBFragment = "Disk 1.0 0.5 270.0";

    private String testRISpecXMLFragment = "<disk height=\"1.0\" radius=\"0.5\" thetamax=\"270.0\"/>";

    public RiDiskTest() {
        super();
    }

    @Test
    public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testUtahTeapotXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiDisk rib = new RiDisk(testUtahTeapotRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

     }

    @Test
     public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiDisk rib = new RiDisk(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

     }
}
