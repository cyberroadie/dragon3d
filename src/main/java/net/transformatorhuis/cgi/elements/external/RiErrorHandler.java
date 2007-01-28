package net.transformatorhuis.cgi.elements.external;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiErrorHandler extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiErrorHandler.class);

    /**
     * ErrorHandler.
     */
    public RiErrorHandler() {
        super();
    }

    /**
     * ErrorHandler.
     * @param param extra parameters
     */
    public RiErrorHandler(final String param) {
        super(param);
    }

}
