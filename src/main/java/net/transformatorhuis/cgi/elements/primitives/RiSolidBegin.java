package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiSolidBegin extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiSolidBegin.class);

    /**
     * SolidBegin.
     */
    public RiSolidBegin() {
        super();
    }

    /**
     * SolidBegin.
     * @param param extra parameters
     */
    public RiSolidBegin(final String param) {
        super(param);
    }

}
