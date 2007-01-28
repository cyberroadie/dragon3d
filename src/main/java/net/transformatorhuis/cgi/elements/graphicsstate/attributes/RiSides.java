package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiSides extends Rib {

    /**
     * Logger. 
     */
    private static Logger logger = Logger.getLogger(RiSides.class);

    /**
     * Sides.
     */
    public RiSides() {
        super();
    }

    /**
     * Sides.
     * @param param extra parameters
     */
    public RiSides(final String param) {
        super(param);
    }

}
