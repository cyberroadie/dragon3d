package net.transformatorhuis.cgi.elements.motion;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiMotionEnd extends Rib {

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

}
