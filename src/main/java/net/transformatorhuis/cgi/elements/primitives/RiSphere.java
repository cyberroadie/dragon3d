package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Sphere;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 78
 */
public class RiSphere extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiSphere.class);

    /**
     * JAXB sphere element
     */
    Sphere sphere;

    /**
     * Sphere.
     */
    public RiSphere() {
        super();
    }

    /**
     * Sphere.
     * @param parameters extra paramters
     */
    public RiSphere(final String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        sphere = objFactory.createSphere();
        sphere.setRadius(Double.valueOf((String) parameterList.get(0)));
        sphere.setZmin(Double.valueOf((String) parameterList.get(1)));
        sphere.setZmax(Double.valueOf((String) parameterList.get(2)));
        sphere.setThetamax(Double.valueOf((String) parameterList.get(3)));

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
        return sphere;
    }

}
