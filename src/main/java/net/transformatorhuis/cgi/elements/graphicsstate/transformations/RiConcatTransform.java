package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiConcatTransform extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiConcatTransform.class);

    /**
     * ConcatTransform.
     */
    public RiConcatTransform() {
        super();
    }

    /**
     * ConcatTransform.
     * @param param extra parameters
     */
    public RiConcatTransform(final String param) {
        super(param);
    }

}
