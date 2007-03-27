package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiColorSamples extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiColorSamples.class);

    /**
     * ColorSamples.
     */
    public RiColorSamples() {
        super();
    }

    /**
     * ColorSamples.
     * @param param extra parameters
     */
    public RiColorSamples(final String param) {
        super(param);
    }

    /**
     * Abstract method to return
     *
     * @return JAXB node returned for RIB element
     */
    public Object getJAXBNode() {
        return null;
    }

}
