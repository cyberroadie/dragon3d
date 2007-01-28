package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiBegin extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiBegin.class);

    /**
     * Begin.
     */
    public RiBegin() {
        super();
    }


    /**
     * Begin.
     * @param param extra parameters
     */
    public RiBegin(String param) {
        super(param);
    }

    /**
     * @return has children
     */
    public boolean hasChildElements() {
        return true;
    }
    
}
