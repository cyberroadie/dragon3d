package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiFormat extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiFormat.class);

    /**
     * Format.
     */
    public RiFormat() {
        super();
    }

    /**
     * Format.
     * @param param extra paraemeters
     */
    public RiFormat(final String param) {
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
