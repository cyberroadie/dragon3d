package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiAtmosphere extends Rib {

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
     * @param param
     */
    public RiAtmosphere(final String param) {
        super(param);
    }

}
