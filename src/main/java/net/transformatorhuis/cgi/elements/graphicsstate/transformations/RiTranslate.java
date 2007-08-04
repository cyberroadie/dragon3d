package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 57
 */
public class RiTranslate extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTranslate.class);

    /**
     * Translate.
     */
    public RiTranslate() {
        super();
    }

    /**
     * Translate.
     * @param param extra parameters
     */
    public RiTranslate(final String param) {
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
