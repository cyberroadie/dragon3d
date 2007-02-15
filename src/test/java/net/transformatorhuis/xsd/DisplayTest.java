package net.transformatorhuis.xsd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import net.transformatorhuis.xsd.Display;
import net.transformatorhuis.xsd.GeneralRibTest;

import javax.xml.bind.JAXBException;

/**
 * Created by IntelliJ IDEA.
 * User: cyberroadie
 * Date: Feb 14, 2007
 * Time: 12:07:13 AM
 */
public class DisplayTest extends GeneralRibTest {

    @Test public void DisplayTest() throws JAXBException {
        Display display = new Display();
        display.setMode("rgb");
        display.setName("");
        display.setType("");

        addRibElement(display);

        toSystemOut();
        
        assertEquals("Display" + display.toString(), "<display></display>", display.toString());
    }

}
