package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiSolidBegin extends AbstractRibType {

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
