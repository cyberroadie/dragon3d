package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiFormat extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiFormat.class);

    /**
     * Format.
     */
    public RiFormat() {
        super();
    }

    /**
     * Format.
     * @param param extra paraemeters
     */
    public RiFormat(final String param) {
        super(param);
    }

}
