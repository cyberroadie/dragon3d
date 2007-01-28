package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiPerspective extends AbstractRib {

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
     * @param param extra parameters
     */
    public RiPerspective(final String param) {
        super(param);
    }

}
