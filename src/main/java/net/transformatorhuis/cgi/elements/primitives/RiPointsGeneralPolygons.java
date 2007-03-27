package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiPointsGeneralPolygons extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPointsGeneralPolygons.class);

    /**
     * PointsGeneralPolygons.
     */
    public RiPointsGeneralPolygons() {
        super();
    }

    /**
     * PointsGeneralPolygons.
     * @param param extra parameters
     */
    public RiPointsGeneralPolygons(final String param) {
        super(param);
    }

}
