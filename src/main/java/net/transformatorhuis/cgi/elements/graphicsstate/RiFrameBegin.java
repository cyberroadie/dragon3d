package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiFrameBegin extends Rib {

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
    public RiFrameBegin(String param) {
        super(param);
    }

    /**
     * @return Has children.
     */
    public boolean hasChildElements() {
        return true;
    }

}
