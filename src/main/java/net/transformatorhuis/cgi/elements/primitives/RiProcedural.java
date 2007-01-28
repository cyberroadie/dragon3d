package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiProcedural extends Rib {

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
