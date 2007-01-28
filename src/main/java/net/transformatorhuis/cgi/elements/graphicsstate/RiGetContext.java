package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiGetContext extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiGetContext.class);

    /**
     * GetContext.
     */
    public RiGetContext() {
        super();
    }

    /**
     * GetContext.
     * @param param extra parameters
     */
    public RiGetContext(final String param) {
        super(param);
    }

}
