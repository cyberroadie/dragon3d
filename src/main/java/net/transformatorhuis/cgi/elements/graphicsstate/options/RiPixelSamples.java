package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiPixelSamples extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPixelSamples.class);

    /**
     * PixelSamples.
     */
    public RiPixelSamples() {
        super();
    }

    /**
     * PixelSamples.
     * @param param extra parameters
     */
    public RiPixelSamples(final String param) {
        super(param);
    }

}
