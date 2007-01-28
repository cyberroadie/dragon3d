package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiCoordinateSystem extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiCoordinateSystem.class);

    /**
     * CoordinateSystem.
     */
    public RiCoordinateSystem() {
        super();
    }

    /**
     * CoordinateSystem.
     * @param param extra parameters
     */
    public RiCoordinateSystem(final String param) {
        super(param);
    }

}
