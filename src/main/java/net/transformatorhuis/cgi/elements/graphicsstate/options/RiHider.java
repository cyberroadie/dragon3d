package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiHider extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiHider.class);

    /**
     * Hider.
     */
    public RiHider() {
        super();
    }

    /**
     * Hider.
     * @param param extra parameters
     */
    public RiHider(final String param) {
        super(param);
    }

}
