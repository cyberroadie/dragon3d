package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiFrameBegin extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiFrameBegin.class);

    /**
     * Start of frame.
     */
    public RiFrameBegin() {
        super();
    }

    /**
     * Start of frame.
     * @param param extra parameters
     */
    public RiFrameBegin(final String param) {
        super(param);
    }

    /**
     * @return Has children.
     */
    public final boolean hasChildElements() {
        return true;
    }

}
