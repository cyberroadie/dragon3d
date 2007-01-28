package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiColor extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiColor.class);

    /**
     * Color.
     */
    public RiColor() {
        super();
    }

    /**
     * Color.
     * @param param extra parameters
     */
    public RiColor(final String param) {
        super(param);
    }

}
