package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiDepthOfField extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiDepthOfField.class);

    /**
     * DepthOfField.
     */
    public RiDepthOfField() {
        super();
    }

    /**
     * DepthOfField.
     * @param param extra parameters
     */
    public RiDepthOfField(final String param) {
        super(param);
    }

}
