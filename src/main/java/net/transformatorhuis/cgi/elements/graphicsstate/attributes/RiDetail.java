package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiDetail extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiDetail.class);

    /**
     * Detail.
     */
    public RiDetail() {
        super();
    }

    /**
     * Detail.
     * @param param extra parameters
     */
    public RiDetail(final String param) {
        super(param);
    }

}
