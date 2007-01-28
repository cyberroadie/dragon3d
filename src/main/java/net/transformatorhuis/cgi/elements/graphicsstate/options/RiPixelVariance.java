package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiPixelVariance extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPixelVariance.class);

    /**
     * PixelVariance.
     */
    public RiPixelVariance() {
        super();
    }

    /**
     * PixelVariance.
     * @param param extra parameters
     */
    public RiPixelVariance(final String param) {
        super(param);
    }

}
