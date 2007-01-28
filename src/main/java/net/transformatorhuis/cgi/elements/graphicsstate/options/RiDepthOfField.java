package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiDepthOfField extends Rib {

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
