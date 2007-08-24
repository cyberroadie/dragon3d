package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Rotate;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 57
 */
public class RiRotate extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiRotate.class);

    /**
     * JAXB rotate element
     */
    Rotate rotate;

    /**
     * Rotate.
     */
    public RiRotate() {
        super();
    }

    /**
     * Rotate.
     * @param parameters extra parameters
     */
    public RiRotate(final String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        rotate = objFactory.createRotate();
        rotate.setAngle(Double.valueOf((String) parameterList.get(0)));
        rotate.setDx(Double.valueOf((String) parameterList.get(1)));
        rotate.setDy(Double.valueOf((String) parameterList.get(2)));
        rotate.setDz(Double.valueOf((String) parameterList.get(3)));

        if (parameterList.size() > 4) {
            setParameters(parameterList, 4);
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
        return rotate;
    }

}
