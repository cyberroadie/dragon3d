package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiWorldEnd extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiWorldEnd.class);

    /**
     * World end element.
     */
    public RiWorldEnd() {
        super();
    }

    /**
     * World end element.
     * @param param extra parameters
     */
    public RiWorldEnd(String param) {
        super(param);
    }

}
