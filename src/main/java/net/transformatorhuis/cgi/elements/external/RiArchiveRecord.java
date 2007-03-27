package net.transformatorhuis.cgi.elements.external;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiArchiveRecord extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiArchiveRecord.class);

    /**
     * ArchiveRecord.
     */
    public RiArchiveRecord() {
        super();
    }
    
    /**
     * ArchiveRecord.
     * @param param extra parameters
     */
    public RiArchiveRecord(final String param) {
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
