package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;

/**
 * @author cyberroadie
 *
 */
public class RiTextureCoordinates extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTextureCoordinates.class);

    /**
     * TextureCoordinates.
     */
    public RiTextureCoordinates() {
        super();
    }

    /**
     * TextureCoordinates.
     * @param param extra parameters
     */
    public RiTextureCoordinates(final String param) {
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
