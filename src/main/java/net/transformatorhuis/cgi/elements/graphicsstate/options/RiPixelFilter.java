package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiPixelFilter extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPixelFilter.class);

    /**
     * PixelFilter.
     */
    public RiPixelFilter() {
        super();
    }

    /**
     * PixelFilter.
     * @param param
     */
    public RiPixelFilter(final String param) {
        super(param);
    }

}
