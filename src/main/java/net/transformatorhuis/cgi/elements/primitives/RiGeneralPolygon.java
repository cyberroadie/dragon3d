package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiGeneralPolygon extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiGeneralPolygon.class);

    /**
     * GeneralPolygon.
     */
    public RiGeneralPolygon() {
        super();
    }

    /**
     * GeneralPolygon.
     * @param param extra parameters
     */
    public RiGeneralPolygon(final String param) {
        super(param);
    }

}
