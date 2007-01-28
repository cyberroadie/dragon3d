package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiFrameAspectRatio extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiFrameAspectRatio.class);

    /**
     * FrameAspectRatio.
     */
    public RiFrameAspectRatio() {
        super();
    }

    /**
     * FrameAspectRatio.
     * @param param extra parameters
     */
    public RiFrameAspectRatio(final String param) {
        super(param);
    }

}
