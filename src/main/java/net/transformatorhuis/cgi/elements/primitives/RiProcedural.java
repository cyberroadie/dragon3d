package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiProcedural extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiProcedural.class);

    /**
     * Procedural.
     */
    public RiProcedural() {
        super();
    }

    /**
     * Procedural.
     * @param param extra parameters
     */
    public RiProcedural(final String param) {
        super(param);
    }

}
