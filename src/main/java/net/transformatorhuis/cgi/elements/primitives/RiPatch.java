package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiPatch extends AbstractRib {

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
