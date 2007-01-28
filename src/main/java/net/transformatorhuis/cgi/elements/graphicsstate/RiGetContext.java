package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiGetContext extends Rib {

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
     * GetContext
     * @param param extra parameters
     */
    public RiGetContext(String param) {
        super(param);
    }

}
