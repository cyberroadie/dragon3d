package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiDisplacement extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiDisplacement.class);

    /**
     * Displacement.
     */
    public RiDisplacement() {
        super();
    }

    /**
     * Displacement
     * @param param extra parameters
     */
    public RiDisplacement(final String param) {
        super(param);
    }

}
