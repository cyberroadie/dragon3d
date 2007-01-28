package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiTransformEnd extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTransformEnd.class);

    /**
     * TransformEnd.
     */
    public RiTransformEnd() {
        super();
    }

    /**
     * TransformEnd.
     * @param param extra parameters
     */
    public RiTransformEnd(final String param) {
        super(param);
    }

    /**
     * Is an end element.
     * @return True
     */
    public boolean isEndElement() {
        return true;
    }
    
}
