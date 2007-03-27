package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiExterior extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiExterior.class);

    /**
     * Exterior.
     */
    public RiExterior() {
        super();
    }

    /**
     * Exterior.
     * @param param extra paramters
     */
    public RiExterior(final String param) {
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
