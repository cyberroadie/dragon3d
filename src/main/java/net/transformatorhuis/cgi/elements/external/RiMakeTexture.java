package net.transformatorhuis.cgi.elements.external;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiMakeTexture extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiMakeTexture.class);

    /**
     * MakeTexture.
     */
    public RiMakeTexture() {
        super();
    }

    /**
     * MakeTexture.
     * @param param extra parameters
     */
    public RiMakeTexture(final String param) {
        super(param);
    }

}
