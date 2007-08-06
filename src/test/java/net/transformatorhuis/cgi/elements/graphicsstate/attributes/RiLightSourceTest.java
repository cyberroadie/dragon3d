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
 * RiLightSource Tester.
 *
 * @author Cyberroadie
 * @since <pre>05/13/2007</pre>
 * @version 1.0
 */
public class RiLightSourceTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiLightSourceTest.class);

    private String testUtahTeapotRIBFragment1 = "\"ambientlight\" 1 \"intensity\" .4";
    
    private String testUtahTeapotXMLFragment1 = "<lightsource shadername=\"ambientlight\" sequencenumber=\"1\">\n" +
                                     "    <param name=\"intensity\" value=\".4\"/>\n" +
                                     "</lightsource>";

    private String testUtahTeapotRIBFragment2 = "LightSource \"distantlight\" 2 \"intensity\" .6 \"from\" [-4 6 -7] \"to\" [0 0 0]";

    private String testUtahTeapotXMLFragment2 = "<lightsource shadername=\"distantlight\" sequencenumber=\"2\">\n" +
                                                "            <param name=\"intensity\" value=\".6\"/>\n" +
                                                "</lightsource>";

    private String testRISpecRIBFragment1 = "\"spotlight\" 2 \"coneangle\" [5]";

    private String testRISpecXMLFragment1 = "<lightsource shadername=\"spotlight\">\n" +
                                         "    <param name=\"coneangle\" value=\"5\"/>\n" +
                                         "</lightsource>";

    private String testRISpecRIBFragment2 = "\"ambientlight\" 3 \"lightcolor\" [.5 0 0] \"intensity\" [.6]";
    
    // TODO Adjustment XML Scheme; the RGB color code of lightcolor needs to be split up
    private String testRISpecXMLFragment2 = "<lightsource shadername=\"ambientlight\">\n" +
                                            "    <param name=\"lightcolor\" value=\".5 0 0\"/>\n" +
                                            "    <param name=\"intensity\" value=\".6\"/>\n" +
                                            "</lightsource>";

    public RiLightSourceTest() {
        super();     
    }

    @Ignore
    @Test
     public void testUtahTeapot1() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testUtahTeapotXMLFragment1);
         logger.info(docFromString.toString());

         // Create JAXB
         RiLightSource rib = new RiLightSource(testUtahTeapotRIBFragment1);
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
         RiLightSource rib = new RiLightSource(testUtahTeapotRIBFragment2);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

     }

    @Ignore
    @Test
    public void testRISpecExample1() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testRISpecXMLFragment1);
        logger.info(docFromString.toString());

        // Create JAXB
        RiLightSource rib = new RiLightSource(testRISpecRIBFragment1);
        Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

    @Ignore
    @Test
    public void testRISpecExample2() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testRISpecXMLFragment2);
        logger.info(docFromString.toString());

        // Create JAXB
        RiLightSource rib = new RiLightSource(testRISpecRIBFragment2);
        Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

}
