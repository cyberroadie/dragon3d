package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiGeometricApproximation extends AbstractRib {

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
