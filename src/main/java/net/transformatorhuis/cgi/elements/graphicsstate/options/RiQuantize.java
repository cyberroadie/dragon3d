package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiQuantize extends Rib {

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

}
