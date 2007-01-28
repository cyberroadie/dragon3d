package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiCone extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiCone.class);

    /**
     * Cone.
     */
    public RiCone() {
        super();
    }

    /**
     * Cone.
     * @param param extra parameters
     */
    public RiCone(final String param) {
        super(param);
    }

}
