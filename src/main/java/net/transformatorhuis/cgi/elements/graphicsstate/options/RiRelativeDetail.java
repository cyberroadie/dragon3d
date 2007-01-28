package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiRelativeDetail extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiRelativeDetail.class);

    /**
     * RelativeDetail.
     */
    public RiRelativeDetail() {
        super();
    }

    /**
     * RelativeDetail
     * @param param extra parameters
     */
    public RiRelativeDetail(final String param) {
        super(param);
    }

}
