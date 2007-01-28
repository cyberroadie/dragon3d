package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * @author cyberroadie
 *
 */
public class RiTextureCoordinates extends Rib {

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

}
