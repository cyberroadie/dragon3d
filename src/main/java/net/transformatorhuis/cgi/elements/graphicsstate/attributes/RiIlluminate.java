package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiIlluminate extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiIlluminate.class);

    /**
     * Illuminate.
     */
    public RiIlluminate() {
        super();
    }

    /**
     * Illuminate.
     * @param param extra parameters
     */
    public RiIlluminate(final String param) {
        super(param);
    }

}
