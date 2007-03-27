package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiNuPatch extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiNuPatch.class);

    /**
     * NuPatch.
     */
    public RiNuPatch() {
        super();
    }

    /**
     * NuPatch.
     * @param param extra parameters
     */
    public RiNuPatch(final String param) {
        super(param);
    }

}
