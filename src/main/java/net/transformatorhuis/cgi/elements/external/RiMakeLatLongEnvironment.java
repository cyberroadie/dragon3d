package net.transformatorhuis.cgi.elements.external;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiMakeLatLongEnvironment extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiMakeLatLongEnvironment.class);

    /**
     * MakeLatLongEnvironment.
     */
    public RiMakeLatLongEnvironment() {
        super();
    }
    
    /**
     * MakeLatLongEnvironment.
     * @param param extra parameters
     */
    public RiMakeLatLongEnvironment(final String param) {
        super(param);
    }
    
}
