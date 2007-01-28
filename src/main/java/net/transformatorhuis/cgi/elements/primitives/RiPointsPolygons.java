package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiPointsPolygons extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPointsPolygons.class);

    /**
     * PointsPolygons.
     */
    public RiPointsPolygons() {
        super();
    }

    /**
     * PointsPolygons.
     * @param param extra parameters
     */
    public RiPointsPolygons(final String param) {
        super(param);
    }

}
