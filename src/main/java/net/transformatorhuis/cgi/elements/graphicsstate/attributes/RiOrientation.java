package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 54
 */
public class RiOrientation extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiOrientation.class);

    /**
     * Orientation.
     */
    public RiOrientation() {
        super();
    }

    /**
     * Orientation.
     * @param param extra parameters
     */
    public RiOrientation(final String param) {
        super(param);
    }

    public Object getJAXBNode() {
        return null;
    }

}
