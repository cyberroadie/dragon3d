package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiTranslate extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTranslate.class);

    /**
     * Translate.
     */
    public RiTranslate() {
        super();
    }

    /**
     * Translate.
     * @param param extra parameters
     */
    public RiTranslate(final String param) {
        super(param);
    }

}
