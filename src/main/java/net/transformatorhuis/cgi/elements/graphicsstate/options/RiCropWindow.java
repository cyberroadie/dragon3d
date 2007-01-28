package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiCropWindow extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiCropWindow.class);

    /**
     * CropWindow
     */
    public RiCropWindow() {
        super();
    }

    /**
     * CropWindow
     * @param param extra parameters
     */
    public RiCropWindow(final String param) {
        super(param);
    }

}
