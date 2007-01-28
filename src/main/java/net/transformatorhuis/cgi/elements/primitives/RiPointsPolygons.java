package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiPointsPolygons extends Rib {

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
