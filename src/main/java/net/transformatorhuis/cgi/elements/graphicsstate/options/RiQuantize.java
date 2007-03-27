package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiQuantize extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiQuantize.class);

    /**
     * Quantize.
     */
    public RiQuantize() {
        super();
    }

    /**
     * Quantize.
     * @param param extra parameters
     */
    public RiQuantize(final String param) {
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
