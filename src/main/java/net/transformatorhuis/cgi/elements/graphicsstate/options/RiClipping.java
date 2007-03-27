package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiClipping extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiClipping.class);

    /**
     * Clipping.
     */
    public RiClipping() {
        super();
    }

    /**
     * Clipping.
     * @param param extra parameters
     */
    public RiClipping(final String param) {
        super(param);
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
