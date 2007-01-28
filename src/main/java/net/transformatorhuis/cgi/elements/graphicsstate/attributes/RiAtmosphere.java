package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiAtmosphere extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiAtmosphere.class);

    /**
     * Atmosphere.
     */
    public RiAtmosphere() {
        super();
    }

    /**
     * Atmosphere.
     * @param param extra parameters
     */
    public RiAtmosphere(final String param) {
        super(param);
    }

}
