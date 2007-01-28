package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiPoints extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPoints.class);

    /**
     * Points.
     */
    public RiPoints() {
        super();
    }

    /**
     * Points.
     * @param param extra paramters
     */
    public RiPoints(final String param) {
        super(param);
    }

}
