package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiExposure extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiExposure.class);

    /**
     * Exposure.
     */
    public RiExposure() {
        super();
    }

    /**
     * Exposure.
     * @param param extra parameters
     */
    public RiExposure(final String param) {
        super(param);
    }

}
