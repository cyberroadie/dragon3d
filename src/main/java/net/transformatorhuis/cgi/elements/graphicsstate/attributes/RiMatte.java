package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiMatte extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiMatte.class);

    /**
     * Matte.
     */
    public RiMatte() {
        super();
    }

    /**
     * Matte.
     * @param param extra parameters
     */
    public RiMatte(final String param) {
        super(param);
    }

}
