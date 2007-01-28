package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiTransform extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTransform.class);

    /**
     * Transform.
     */
    public RiTransform() {
        super();
    }

    /**
     * Transform.
     * @param param extra parameters
     */
    public RiTransform(final String param) {
        super(param);
    }

}
