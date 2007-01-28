package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiSubdivisionMesh extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiSubdivisionMesh.class);

    /**
     * SubdivisionMesh.
     */
    public RiSubdivisionMesh() {
        super();
    }

    /**
     * SubdivisionMesh.
     * @param param extra parameters
     */
    public RiSubdivisionMesh(final String param) {
        super(param);
    }

}
