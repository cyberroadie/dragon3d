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

    private String testXMLFragment_0 = "<lightsource shadername=\"ambientlight\">\n" +
                                     "    <param name=\"intensity\" value=\".4\"/>\n" +
                                     "</lightsource>";

    private String testRIBFragment_0 = "\"ambientlight\" 1 \"intensity\" .4";

    private String testXMLFragment_1 = "<lightsource shadername=\"ambientlight\">\n" +
                                         "    <param name=\"intensity\" value=\".4\"/>\n" +
                                         "</lightsource>";

    private String testRIBFragment_1 = "\"ambientlight\" 1 \"intensity\" .4";


    public RiLightSourceTest() {
        super();     
    }

    @Ignore
    @Test
     public void testGetJAXBNode_0() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testXMLFragment_0);
         logger.info(docFromString.toString());

         // Create JAXB
         RiLightSource rib = new RiLightSource(testRIBFragment_0);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

     }

    @Test
    public void testGetJAXBNode_1() throws IOException, SAXException, ParserConfigurationException, JAXBException {

        // Create DOM document
        Document docFromString = getDOMDocument(testXMLFragment_1);
        logger.info(docFromString.toString());

        // Create JAXB
        RiLightSource rib = new RiLightSource(testRIBFragment_1);
        Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

        assertTrue(compareDocuments(docFromString, docFromJAXB));

    }

}
