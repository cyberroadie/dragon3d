package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiObjectInstance extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiObjectInstance.class);

    /**
     * ObjectInstance.
     */
    public RiObjectInstance() {
        super();
    }

    /**
     * ObjectInstance.
     * @param param extra parameters
     */
    public RiObjectInstance(final String param) {
        super(param);
    }

}
