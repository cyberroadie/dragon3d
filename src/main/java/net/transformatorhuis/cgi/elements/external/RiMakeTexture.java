package net.transformatorhuis.cgi.elements.external;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiMakeTexture extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiMakeTexture.class);
    
    /**
     * MakeTexture.
     */
    public RiMakeTexture() {
        super();
    }
    	
    /**
     * MakeTexture.
     * @param param
     */
    public RiMakeTexture(String param) {
        super(param);
    }
    
}
