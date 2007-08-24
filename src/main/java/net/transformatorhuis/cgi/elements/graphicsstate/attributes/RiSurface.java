package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Surface;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 44
 */
public class RiSurface extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiSurface.class);

    /**
     * JAXB Surface element
     */
    private Surface surface;
    
    /**
     * Surface.
     */
    public RiSurface() {
        super();
    }

    /**
     * Surface.
     * @param parameters extra parameters
     */
    public RiSurface(final String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        surface = objFactory.createSurface();
        surface.setShadername((String) parameterList.get(0));

        if (parameterList.size() > 1) {
            setParameters(parameterList, 1);
        } else {
            setParameters(null, 0);
        }
    }

    /**
     * Abstract method to return
     *
     * @return JAXB node returned for RIB element
     */
    public Object getJAXBNode() {
        return surface;
    }

}
