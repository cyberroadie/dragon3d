package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author Olivier Van Acker
 *
 */
public class RiShadingRate extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiShadingRate.class);

    /**
     * ShadingRate.
     */
    public RiShadingRate() {
        super();
    }

    /**
     * ShadingRate.
     * @param param extra parameters
     */
    public RiShadingRate(final String param) {
        super(param);
    }

}
