package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiClippingPlane extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiClippingPlane.class);

    /**
     * ClippingPlane.
     */
    public RiClippingPlane() {
        super();
    }

    /**
     * ClippingPlane.
     * @param param extra parameters
     */
    public RiClippingPlane(final String param) {
        super(param);
    }

}
