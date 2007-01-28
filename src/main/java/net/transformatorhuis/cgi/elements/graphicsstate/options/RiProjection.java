package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiProjection extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiProjection.class);

    /**
     * Projection.
     */
    public RiProjection() {
        super();
    }

    /**
     * Projection.
     * @param param extra parameters
     */
    public RiProjection(final String param) {
        super(param);
    }

}
