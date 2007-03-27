package net.transformatorhuis.cgi.elements.external;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiMakeCubeFaceEnvironment extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiMakeCubeFaceEnvironment.class);

    /**
     * MakeCubeFaceEnvironment.
     */
    public RiMakeCubeFaceEnvironment() {
        super();
    }
    
    /**
     * MakeCubeFaceEnvironment.
     * @param param extra parameters
     */
    public RiMakeCubeFaceEnvironment(final String param) {
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
