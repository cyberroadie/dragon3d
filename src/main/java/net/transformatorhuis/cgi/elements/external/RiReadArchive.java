package net.transformatorhuis.cgi.elements.external;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiReadArchive extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiReadArchive.class);

    /**
     * ReadArchive.
     */
    public RiReadArchive() {
        super();
    }
	
    /**
     * ReadArchive.
     * @param param
     */
    public RiReadArchive(final String param) {
        super(param);
    }
}
