package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiFrameBegin extends AbstractRib {

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

    /**
     * Abstract method to return
     *
     * @return JAXB node returned for RIB element
     */
    public Object getJAXBNode() {
        return null;
    }

}
