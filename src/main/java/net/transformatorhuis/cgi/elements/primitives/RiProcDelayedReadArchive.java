package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiProcDelayedReadArchive extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiProcDelayedReadArchive.class);

    /**
     * ProcDelayedReadArchive.
     */
    public RiProcDelayedReadArchive() {
        super();
    }

    /**
     * ProcDelayedReadArchive.
     * @param param extra parameters
     */
    public RiProcDelayedReadArchive(final String param) {
        super(param);
    }

}
