package net.transformatorhuis.cgi.elements.external;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiMakeShadow extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiMakeShadow.class);

    /**
     * MakeShadow.
     */
    public RiMakeShadow() {
        super();
    }

    /**
     * MakeShadow.
     * @param param extra parameters
     */
    public RiMakeShadow(final String param) {
        super(param);
    }
}
