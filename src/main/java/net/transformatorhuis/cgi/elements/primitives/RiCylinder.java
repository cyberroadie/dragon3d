package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiCylinder extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiCylinder.class);

    /**
     * Cylinder.
     */
    public RiCylinder() {
        super();
    }

    /**
     * Cylinder.
     * @param param extra parameters
     */
    public RiCylinder(final String param) {
        super(param);
    }

}
