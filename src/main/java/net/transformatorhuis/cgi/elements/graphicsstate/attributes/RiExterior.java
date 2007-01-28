package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiExterior extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiExterior.class);

    /**
     * Exterior.
     */
    public RiExterior() {
        super();
    }

    /**
     * Exterior.
     * @param param
     */
    public RiExterior(final String param) {
        super(param);
    }

}
