package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiProcDynamicLoad extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiProcDynamicLoad.class);

    /**
     * ProcDynamicLoad.
     */
    public RiProcDynamicLoad() {
        super();
    }

    /**
     * ProcDynamicLoad.
     * @param param extra parameters
     */
    public RiProcDynamicLoad(final String param) {
        super(param);
    }

}
