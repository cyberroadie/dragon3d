package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiTrimCurve extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTrimCurve.class);

    /**
     * TrimCurve.
     */
    public RiTrimCurve() {
        super();
    }

    /**
     * TrimCurve.
     * @param param extra parameters
     */
    public RiTrimCurve(final String param) {
        super(param);
    }

}
