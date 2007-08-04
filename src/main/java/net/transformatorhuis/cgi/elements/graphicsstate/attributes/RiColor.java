package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 38
 */
public class RiColor extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiColor.class);

    /**
     * Color.
     */
    public RiColor() {
        super();
    }

    /**
     * Color.
     * @param param extra parameters
     */
    public RiColor(final String param) {
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
