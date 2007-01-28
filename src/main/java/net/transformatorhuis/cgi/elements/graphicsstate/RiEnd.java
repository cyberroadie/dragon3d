package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiEnd extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiEnd.class);

    /**
     * The end.
     */
    public RiEnd() {
        super();
    }

    /**
     * The end.
     * @param param extra parameters.
     */
    public RiEnd(final String param) {
        super(param);
    }

}
