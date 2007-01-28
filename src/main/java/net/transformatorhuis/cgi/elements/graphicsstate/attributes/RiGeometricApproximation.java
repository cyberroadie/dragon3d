package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiGeometricApproximation extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = 
        Logger.getLogger(RiGeometricApproximation.class);

    /**
     * GeometricApproximation.
     */
    public RiGeometricApproximation() {
        super();
    }

    /**
     * GeometricApproximation.
     * @param param extra parameters
     */
    public RiGeometricApproximation(final String param) {
        super(param);
    }

}
