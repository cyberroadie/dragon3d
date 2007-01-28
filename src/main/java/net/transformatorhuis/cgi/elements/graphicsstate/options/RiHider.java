package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiHider extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiHider.class);

    /**
     * Hider.
     */
    public RiHider() {
        super();
    }

    /**
     * Hider.
     * @param param extra parameters
     */
    public RiHider(final String param) {
        super(param);
    }

}
