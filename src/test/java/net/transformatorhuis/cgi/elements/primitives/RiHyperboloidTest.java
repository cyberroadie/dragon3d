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
 * RiHyperboloid Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiHyperboloidTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiHyperboloidTest.class);

    private String testUtahTeapotRIBFragment = "Hyperboloid  1.2 0 0 .4 0 5.7  360";
    
    private String testUtahTeapotXMLFragment = "<hyperboloid thetamax=\"360.0\" x1=\"1.2\" y1=\"0.0\" z1=\"0.0\" x2=\"0.4\" y2=\"0.0\" z2=\"5.7\"/>";

    private String testRISpecRIBFragment = "Hyperboloid 0 0 0 .5 0 0 270 \"Cs\" [1 1 1 .5 .9 1 .2 .9 0 .5 .2 0]";

    private String testRISpecXMLFragment = "<hyperboloid thetamax=\"270.0\" x1=\"0.0\" y1=\"0.0\" z1=\"0.0\" x2=\"0.5\" y2=\"0.0\" z2=\"0.0\">" +
                                           "    <param name=\"Cs\" value=\"[1 1 1 .5 .9 1 .2 .9 0 .5 .2 0]\"/>" +
                                           "</hyperboloid>";

    public RiHyperboloidTest() {
        super();     
    }

    @Test
     public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testUtahTeapotXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiHyperboloid rib = new RiHyperboloid(testUtahTeapotRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

     }

    @Test
     public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiHyperboloid rib = new RiHyperboloid(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

     }

}
