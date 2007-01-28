package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiObjectEnd extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiObjectEnd.class);

    /**
     * ObjectEnd.
     */
    public RiObjectEnd() {
        super();
    }

    /**
     * ObjectEnd.
     * @param param extra parameters
     */
    public RiObjectEnd(final String param) {
        super(param);
    }

}
