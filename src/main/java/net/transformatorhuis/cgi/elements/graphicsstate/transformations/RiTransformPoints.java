package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiTransformPoints extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTransformPoints.class);

    /**
     * TransformPoints.
     */
    public RiTransformPoints() {
        super();
    }

    /**
     * TransformPoints.
     * @param param extra paramters
     */
    public RiTransformPoints(final String param) {
        super(param);
    }

}
