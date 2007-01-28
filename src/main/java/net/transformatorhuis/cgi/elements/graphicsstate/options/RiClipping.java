package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiClipping extends Rib {

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

}
