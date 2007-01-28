package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiAreaLightSource extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiAreaLightSource.class);

    /**
     * AreaLightSource.
     */
    public RiAreaLightSource() {
        super();
    }

    /**
     * AreaLightSource.
     * @param param extra parameters
     */
    public RiAreaLightSource(final String param) {
        super(param);
    }

}
