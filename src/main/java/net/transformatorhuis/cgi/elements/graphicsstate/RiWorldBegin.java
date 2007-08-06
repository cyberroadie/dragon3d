package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 17
 */
public class RiWorldBegin extends AbstractRib {

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

    /**
     * Abstract method to return
     *
     * @return JAXB node returned for RIB element
     */
    public Object getJAXBNode() {
        return null;
    }

}
