package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 55
 */
public class RiSides extends AbstractRib {

    /**
     * Logger. 
     */
    private static Logger logger = Logger.getLogger(RiSides.class);

    /**
     * Sides.
     */
    public RiSides() {
        super();
    }

    /**
     * Sides.
     * @param param extra parameters
     */
    public RiSides(final String param) {
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
