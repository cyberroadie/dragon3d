package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiDetailRange extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiDetailRange.class);

    /**
     * DetailRange.
     */
    public RiDetailRange() {
        super();
    }

    /**
     * DetailRange.
     * @param param extra parameters
     */
    public RiDetailRange(final String param) {
        super(param);
    }

}
