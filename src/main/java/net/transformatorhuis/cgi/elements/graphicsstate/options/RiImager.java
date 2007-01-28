package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiImager extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiImager.class);

    /**
     * Imager.
     */
    public RiImager() {
        super();
    }

    /**
     * Imager.
     * @param param extra parameters
     */
    public RiImager(final String param) {
        super(param);
    }

}
