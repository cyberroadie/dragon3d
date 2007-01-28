package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiProjection extends AbstractRib {

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
