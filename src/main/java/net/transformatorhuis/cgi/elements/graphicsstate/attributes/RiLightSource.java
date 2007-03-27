package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiLightSource extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiLightSource.class);

    /**
     * LightSource.
     */
    public RiLightSource() {
        super();
    }

    /**
     * LightSource.
     * @param param extra parameter
     */
    public RiLightSource(final String param) {
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
