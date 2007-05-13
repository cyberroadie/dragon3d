package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiDisk extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiDisk.class);

    /**
     * Disk.
     */
    public RiDisk() {
        super();
    }

    /**
     * Disk.
     * @param param extra parameters
     */
    public RiDisk(final String param) {
        super(param);
    }

    /**
     * Abstract method to return
     *
     * @return JAXB node returned for RIB element
     */
    public Object getJAXBNode() {
        return null;
    }

}
