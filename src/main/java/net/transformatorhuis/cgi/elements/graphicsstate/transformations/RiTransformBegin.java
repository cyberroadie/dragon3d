package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiTransformBegin extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTransformBegin.class);

    /**
     * TransformBegin.
     */
    public RiTransformBegin() {
        super();
    }

    /**
     * TransformBegin.
     * @param param extra paramters
     */
    public RiTransformBegin(final String param) {
        super(param);
    }

    /**
     * Child elements.
     * @return Has child elements
     */
    public final boolean hasChildElements() {
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
