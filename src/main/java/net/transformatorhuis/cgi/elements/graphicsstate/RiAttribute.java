package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
/**
 * @author cyberroadie
 *
 */
public class RiAttribute extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiAttribute.class);

    /**
     * Attribute.
     */
    public RiAttribute() {
        super();
    }

    /**
     * Attribute.
     * @param param extra parameters
     */
    public RiAttribute(String param) {
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
