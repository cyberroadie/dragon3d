package net.transformatorhuis.cgi.elements.motion;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiMotionEnd extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiMotionEnd.class);

    /**
     * MotionEnd.
     */
    public RiMotionEnd() {
        super();
    }

    /**
     * MotionEnd.
     * @param param extra paramters
     */
    public RiMotionEnd(final String param) {
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
