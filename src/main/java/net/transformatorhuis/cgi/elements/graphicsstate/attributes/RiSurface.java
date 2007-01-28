package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiSurface extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiSurface.class);

    /**
     * Surface.
     */
    public RiSurface() {
        super();
    }

    /**
     * Surface.
     * @param param extra parameters
     */
    public RiSurface(final String param) {
        super(param);
    }

}
