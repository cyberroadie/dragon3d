package net.transformatorhuis.cgi.elements;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
class RiDeclare extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiDeclare.class);

    /**
     * Declare.
     */
    public RiDeclare() {
        super();
    }

    /**
     * Declare.
     * @param param extra parameters
     */
    public RiDeclare(final String param) {
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
