package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;

import org.w3c.dom.Element;

import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.cgi.conversion.RibDocument;
import net.transformatorhuis.xsd.Display;

import java.util.Vector;

import org.w3c.dom.Node;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 33
 */
public class RiDisplay extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiDisplay.class);

    /**
     * JAXB Display element
     */
    private Display display;

    /**
     * @param parameters parameters.
     */
    public RiDisplay(String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        display = objFactory.createDisplay();
        display.setName((String) parameterList.get(0));
        display.setType((String) parameterList.get(1));
        display.setMode((String) parameterList.get(2));

        if (parameterList.size() > 3) {
            setParameters(parameterList, 3);
        } else {
            setParameters(null, 0);
        }
    }

    /**
     * Creates the XML fragment for RiDisplay rib element.
     * <h1>Example</h1>
     * Input:
     *
     * <pre>
     *   Display &quot;swordMesh.tif&quot; &quot;file&quot; &quot;rgba&quot;
     * </pre>
     *
     * <p>
     * Output with parameters:
     *
     * <pre>
     *   &lt;display name=&quot;swordMesh.tif&quot; type=&quot;file&quot; mode=&quot;rgba&quot; &gt;
     *          &lt;param name=&quot;[name]&quot; value=&quot;[value]&quot; /&gt;
     *   &lt;/display&gt;
     * </pre>
     *
     * <p>
     * Output without parameters:
     *
     * <pre>
     *   &lt;display name=&quot;swordMesh.tif&quot; type=&quot;file&quot; mode=&quot;rgba&quot; /&gt;
     * </pre>
     *
     */
    public Node createXML(RibDocument ribDoc) {

        Element ribRoot = ribDoc.requestElement(getElementName());
        ribRoot.setAttribute("name", display.getName());
        ribRoot.setAttribute("type", display.getType());
        ribRoot.setAttribute("mode", display.getMode());

        return (Node) ribRoot;

    }

    public Object getJAXBNode() {
        return display;
    }

}
