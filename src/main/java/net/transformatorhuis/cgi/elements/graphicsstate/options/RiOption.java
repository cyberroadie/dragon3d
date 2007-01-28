package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiOption extends AbstractRib {

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
