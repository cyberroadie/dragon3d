package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiHyperboloid extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiHyperboloid.class);

    /**
     * Hyperboloid.
     */
    public RiHyperboloid() {
        super();
    }

    /**
     * Hyperboloid.
     * @param param extra parameters
     */
    public RiHyperboloid(final String param) {
        super(param);
    }

}
