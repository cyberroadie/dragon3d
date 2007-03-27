package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiCoordinateSystem extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiCoordinateSystem.class);

    /**
     * CoordinateSystem.
     */
    public RiCoordinateSystem() {
        super();
    }

    /**
     * CoordinateSystem.
     * @param param extra parameters
     */
    public RiCoordinateSystem(final String param) {
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
