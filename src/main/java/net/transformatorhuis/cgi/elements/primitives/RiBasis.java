package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiBasis extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiBasis.class);

    /**
     * Basis.
     */
    public RiBasis() {
        super();
    }


    /**
     * Basis.
     * @param param extra parameters
     */
    public RiBasis(final String param) {
        super(param);
    }

}
