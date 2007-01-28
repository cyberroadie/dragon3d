package net.transformatorhuis.cgi.elements.external;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiMakeShadow extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiMakeShadow.class);

    /**
     * MakeShadow.
     */
    public RiMakeShadow() {
        super();
    }
    
    /**
     * MakeShadow.
     * @param param
     */
    public RiMakeShadow(final String param) {
	    super(param);
	}
}
