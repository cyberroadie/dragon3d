package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiSolidEnd extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiSolidEnd.class);

    /**
     * SolidEnd.
     */
    public RiSolidEnd() {
        super();
    }

    /**
     * SolidEnd.
     * @param param extra parameters
     */
    public RiSolidEnd(final String param) {
        super(param);
    }

}
