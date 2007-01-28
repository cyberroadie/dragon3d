package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiReverseOrientation extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiReverseOrientation.class);

    /**
     * ReverseOrientation.
     */
    public RiReverseOrientation() {
        super();
    }

    /**
     * ReverseOrientation.
     * @param param extra parameters
     */
    public RiReverseOrientation(final String param) {
        super(param);
    }

}
