package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author Olivier Van Acker
 *
 */
public class RiShadingRate extends AbstractRib {

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

    /**
     * Abstract method to return
     *
     * @return JAXB node returned for RIB element
     */
    public Object getJAXBNode() {
        return null;
    }

}
