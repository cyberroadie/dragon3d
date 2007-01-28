package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiSkew extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiSkew.class);

    /**
     * Skew.
     */
    public RiSkew() {
        super();
    }

    /**
     * Skew.
     * @param param extra parameters
     */
    public RiSkew(final String param) {
        super(param);
    }

}
