package net.transformatorhuis.cgi.elements.motion;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiMotionBegin extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiMotionBegin.class);

    /**
     * MotionBegin.
     */
    public RiMotionBegin() {
        super();
    }

    /**
     * MotionBegin.
     * @param param extra parameters
     */
    public RiMotionBegin(final String param) {
        super(param);
    }
    
    /**
     * Child elements.
     * @return has chile elements
     */
    public boolean hasChildElements() {
        return true;
    }

}
