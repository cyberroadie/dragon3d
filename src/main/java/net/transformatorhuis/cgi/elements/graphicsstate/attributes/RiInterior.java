package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiInterior extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiInterior.class);

    /**
     * Interior.
     */
    public RiInterior() {
        super();
    }

    /**
     * Interior.
     * @param param extra parameters
     */
    public RiInterior(final String param) {
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
