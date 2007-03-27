package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiPolygon extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPolygon.class);

    /**
     * Polygon.
     */
    public RiPolygon() {
        super();
    }

    /**
     * Polygon.
     * @param param extra parameters
     */
    public RiPolygon(final String param) {
        super(param);
    }

}
