package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.junit.Test;
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
public class RiAttributeStackTest extends GeneralRibTest {

    private static Logger logger = Logger.getLogger(RiAttributeStackTest.class);

    private String testRISpecRIBFragment = "AttributeBegin";
    
    private String testRISpecXMLFragment = "<attributestack></attributestack>";

    public RiAttributeStackTest() {
        super();     
    }

    @Test
    public void testRISpecExample() throws IOException, SAXException, ParserConfigurationException, JAXBException {

         // Create DOM document
         Document docFromString = createDOMFragmentFromString(testRISpecXMLFragment);
         logger.info(docFromString.toString());

         // Create JAXB
         RiAttributeBegin ribStart = new RiAttributeBegin(testRISpecRIBFragment);
         RiAttributeEnd ribEnd = new RiAttributeEnd(testRISpecRIBFragment);
         Document docFromJAXB = getDOMFromJAXB(ribStart.getJAXBNode());

         assertTrue(diffDocuments(docFromString, docFromJAXB));

    }
    
}
