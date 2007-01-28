package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiPatchMesh extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiPatchMesh.class);

    /**
     * PatchMesh.
     */
    public RiPatchMesh() {
        super();
    }

    /**
     * PatchMesh.
     * @param param extra parameters
     */
    public RiPatchMesh(final String param) {
        super(param);
    }

}
