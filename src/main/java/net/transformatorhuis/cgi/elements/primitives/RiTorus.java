package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiTorus extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTorus.class);

    /**
     * Torus.
     */
    public RiTorus() {
        super();
    }

    /**
     * Torus.
     * @param param extra parameters
     */
    public RiTorus(final String param) {
        super(param);
    }

}
