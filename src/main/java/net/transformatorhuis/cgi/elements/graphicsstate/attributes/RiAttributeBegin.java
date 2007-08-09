package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

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
     * AttributeBegin.
     */
    public RiAttributeBegin() {
        super();
    }

    /**
     * AttributeBegin.
     * @param param extra parameters
     */
    public RiAttributeBegin(final String param) {
        super(param);
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
        return null;
    }

}
