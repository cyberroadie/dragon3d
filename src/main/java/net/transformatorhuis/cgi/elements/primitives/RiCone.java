package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiCone extends AbstractRibType {

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
