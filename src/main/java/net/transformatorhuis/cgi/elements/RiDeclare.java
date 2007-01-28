package net.transformatorhuis.cgi.elements;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
class RiDeclare extends Rib {

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

}
