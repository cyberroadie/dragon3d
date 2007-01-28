package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiIdentity extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiIdentity.class);

    /**
     * Identity.
     */
    public RiIdentity() {
        super();
    }

    /**
     * Identity.
     * @param param extra parameters
     */
    public RiIdentity(final String param) {
        super(param);
    }

}
