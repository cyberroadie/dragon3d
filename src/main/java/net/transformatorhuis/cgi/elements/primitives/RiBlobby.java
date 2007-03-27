package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;

/**
 * @author cyberroadie
 *
 */
public class RiBlobby extends AbstractRibType {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiBlobby.class);

    /**
     * Blobby.
     */
    public RiBlobby() {
        super();
    }


    /**
     * Blobby.
     * @param param extra parameters
     */
    public RiBlobby(final String param) {
        super(param);
    }

}
