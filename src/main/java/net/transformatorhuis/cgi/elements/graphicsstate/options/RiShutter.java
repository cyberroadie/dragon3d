package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiShutter extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiShutter.class);

    /**
     * Shutter.
     */
    public RiShutter() {
        super();
    }

    /**
     * Shutter.
     * @param param extra paramteters
     */
    public RiShutter(final String param) {
        super(param);
    }

}
