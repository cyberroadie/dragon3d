package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiOption extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiOption.class);

    /**
     * Option.
     */
    public RiOption() {
        super();
    }

    /**
     * Option.
     * @param param extra parameters
     */
    public RiOption(final String param) {
        super(param);
    }

}
