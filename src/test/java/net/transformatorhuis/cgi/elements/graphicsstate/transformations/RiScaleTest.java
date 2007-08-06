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
 * RiScale Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiScaleTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiScaleTest.class);

    private String testUtahTeapotRIBFragment = "Scale 1 1 1.05468457";
    
    private String testUtahTeapotXMLFragment = "<scale sx=\"1\" sy=\"1\" sz=\"1.05468457\"/>";

    private String testRISpecRIBFragment = "Scale 0.5 1 1";

    private String testRISpecXMLFragment = "<scale sx=\"0.5\" sy=\"1\" sz=\"1\"/>";

    public RiScaleTest() {
        super();     
    }

    @Ignore
    @Test
    public void testUtahTeapot() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testUtahTeapotXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiScale rib = new RiScale(testUtahTeapotRIBFragment);
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
         RiScale rib = new RiScale(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

}
