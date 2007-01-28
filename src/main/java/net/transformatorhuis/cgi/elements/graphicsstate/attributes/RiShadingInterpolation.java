package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiShadingInterpolation extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiShadingInterpolation.class);

    /**
     * ShadingInterpolation.
     */
    public RiShadingInterpolation() {
        super();
    }

    /**
     * ShadingInterpolation.
     * @param param extra parameters
     */
    public RiShadingInterpolation(final String param) {
        super(param);
    }

}
