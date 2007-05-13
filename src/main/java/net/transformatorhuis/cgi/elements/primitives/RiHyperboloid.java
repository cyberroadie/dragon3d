package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Hyperboloid;

/**
 * @author cyberroadie
 *
 */
public class RiHyperboloid extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiHyperboloid.class);

    /**
     * JAXB Hyperboloid element
     */
    private Hyperboloid hyperboloid;

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

    public Object getJAXBNode() {
            return hyperboloid;
    }


}
