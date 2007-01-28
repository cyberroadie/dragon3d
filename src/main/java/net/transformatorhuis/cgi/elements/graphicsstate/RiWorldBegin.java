package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiWorldBegin extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiWorldBegin.class);

    /**
     * World start element.
     */
    public RiWorldBegin() {
        super();
    }

    /**
     * World start element.
     * @param param extra parameters
     */
    public RiWorldBegin(String param) {
        super(param);
    }

    /**
     * Has child elements.
     * @return true
     */
    public boolean hasChildElements() {
        return true;
    }
    
}
