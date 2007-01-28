package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiOpacity extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiOpacity.class);

    /**
     * Opacity.
     */
    public RiOpacity() {
        super();
    }

    /**
     * Opacity.
     * @param param extra parameters
     */
    public RiOpacity(final String param) {
        super(param);
    }

}
