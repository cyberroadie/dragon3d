package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiFrameEnd extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiFrameEnd.class);

    /**
     * End of frame.
     */
    public RiFrameEnd() {
        super();
    }

    /**
     * End of frame.
     * @param param extra parameters
     */
    public RiFrameEnd(final String param) {
        super(param);
    }

}
