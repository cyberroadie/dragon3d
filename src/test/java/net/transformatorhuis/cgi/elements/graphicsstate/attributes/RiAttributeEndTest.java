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
 * RiAttributeEnd Tester.
 *
 * @author Cyberroadie
 * @since <pre>08/07/2007</pre>
 * @version 1.0
 */
public class RiAttributeEndTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiAttributeEndTest.class);

    private String testRIBFragment = "AttributeBegin";
    
    private String testRISpecXMLFragment = "</attributestack>";

    public RiAttributeEndTest() {
        super();     
    }

    @Ignore
    @Test
    public void testGetJAXBNode() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiAttributeEnd rib = new RiAttributeEnd(testRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

    }
    
}
