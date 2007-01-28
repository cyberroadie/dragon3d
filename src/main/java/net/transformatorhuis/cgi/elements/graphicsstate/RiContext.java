package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiContext extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiContext.class);

    /**
     * Context.
     */
    public RiContext() {
        super();
    }

    /**
     * Context.
     * @param param extra parameters
     */
    public RiContext(final String param) {
        super(param);
    }

}
