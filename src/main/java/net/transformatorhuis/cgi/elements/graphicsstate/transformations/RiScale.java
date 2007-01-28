package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiScale extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiScale.class);

    /**
     * Scale.
     */
    public RiScale() {
        super();
    }

    /**
     * Scale.
     * @param param extra parameters
     */
    public RiScale(final String param) {
        super(param);
    }

}
