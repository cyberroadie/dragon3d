package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Attribute;
import net.transformatorhuis.xsd.Attributestack;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 38 
 */
public class RiAttributeBegin extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiAttributeBegin.class);

    /**
     * JAXB RiAttributeBegin element
     */
    private Attributestack attributstack;

    /**
     * AttributeBegin.
     */
    public RiAttributeBegin() {
        super();
    }

    /**
     * AttributeBegin.
     * @param parameters extra parameters
     */
    public RiAttributeBegin(final String parameters) {
        super(parameters);
        attributstack = objFactory.createAttributestack();
    }

    /**
     * @return has child elements
     */
    public final boolean hasChildElements() {
        return true;
    }

    /**
     * Abstract method to return
     *
     * @return JAXB node returned for RIB element
     */
    public Object getJAXBNode() {
        return attributstack;
    }

}
