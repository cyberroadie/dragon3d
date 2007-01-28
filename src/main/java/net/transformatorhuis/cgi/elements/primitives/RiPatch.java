package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiPatch extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPatch.class);

    /**
     * Patch.
     */
    public RiPatch() {
        super();
    }

    /**
     * Patch.
     * @param param extra parameters
     */
    public RiPatch(final String param) {
        super(param);
    }

}
