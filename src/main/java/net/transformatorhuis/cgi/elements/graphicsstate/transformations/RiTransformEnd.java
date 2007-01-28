package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiTransformEnd extends Rib {

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
     * Has end elements
     * @return True
     */
    public boolean isEndElement() {
        return true;
    }
    
}
