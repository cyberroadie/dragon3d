package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiScreenWindow extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiScreenWindow.class);

    /**
     * ScreenWindow.
     */
    public RiScreenWindow() {
        super();
    }

    /**
     * ScreenWindow.
     * @param param
     */
    public RiScreenWindow(final String param) {
        super(param);
    }

}
