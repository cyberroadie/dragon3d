package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiRotate extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiRotate.class);

    /**
     * Rotate.
     */
    public RiRotate() {
        super();
    }

    /**
     * Rotate.
     * @param param extra parameters
     */
    public RiRotate(final String param) {
        super(param);
    }

}
