package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiSphere extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiSphere.class);

    /**
     * Sphere.
     */
    public RiSphere() {
        super();
    }

    /**
     * Sphere.
     * @param param extra paramters
     */
    public RiSphere(final String param) {
        super(param);
    }

}
