package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiAttributeBegin extends Rib {

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

}
