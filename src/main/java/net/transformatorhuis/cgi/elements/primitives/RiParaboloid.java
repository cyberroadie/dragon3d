package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiParaboloid extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiParaboloid.class);

    /**
     * Paraboloid.
     */
    public RiParaboloid() {
        super();
    }

    /**
     * Paraboloid.
     * @param param extra parameters
     */
    public RiParaboloid(final String param) {
        super(param);
    }

}
