package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiObjectBegin extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiObjectBegin.class);

    /**
     * ObjectBegin.
     */
    public RiObjectBegin() {
        super();
    }

    /**
     * ObjectBegin.
     * @param param extra parameters
     */
    public RiObjectBegin(final String param) {
        super(param);
    }

}
