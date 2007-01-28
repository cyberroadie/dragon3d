package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiPerspective extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPerspective.class);

    /**
     * Perspective.
     */
    public RiPerspective() {
        super();
    }

    /**
     * Perspective.
     * @param param
     */
    public RiPerspective(final String param) {
        super(param);
    }

}
