package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiCoordSysTransform extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiCoordSysTransform.class);

    /**
     * CoordSysTransform.
     */
    public RiCoordSysTransform() {
        super();
    }

    /**
     * CoordSysTransform.
     * @param param extra parameters
     */
    public RiCoordSysTransform(final String param) {
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
