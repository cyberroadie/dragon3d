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
 * RiAttributeBegin Tester.
 *
 * @author Cyberroadie
 * @since <pre>08/07/2007</pre>
 * @version 1.0
 */
public class RiAttributeBeginTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiAttributeBeginTest.class);

    private String testRISpecRIBFragment = "AttributeBegin";
    
    private String testRISpecXMLFragment = "<attributestack>";

    public RiAttributeBeginTest() {
        super();     
    }

    @Ignore
    @Test
    public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = getDOMDocument(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiAttributeBegin rib = new RiAttributeBegin(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(rib.getJAXBNode());

         assertTrue(compareDocuments(docFromString, docFromJAXB));

    }
    
}
