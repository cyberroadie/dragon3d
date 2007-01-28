package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiGeometry extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiGeometry.class);

    /**
     * Geometry.
     */
    public RiGeometry() {
        super();
    }

    /**
     * Geometry.
     * @param param extra parameters
     */
    public RiGeometry(final String param) {
        super(param);
    }

}
