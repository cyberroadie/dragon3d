package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Cylinder;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 79
 */
public class RiCylinder extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiCylinder.class);

    /**
     * JAXB cylinder element
     */
    private Cylinder cylinder;

    /**
     * Cylinder.
     */
    public RiCylinder() {
        super();
    }

    /**
     * Cylinder.
     * @param parameters extra parameters
     */
    public RiCylinder(final String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        cylinder = objFactory.createCylinder();
        cylinder.setRadius(Double.valueOf((String) parameterList.get(0)));
        cylinder.setZmin(Double.valueOf((String) parameterList.get(1)));
        cylinder.setZmax(Double.valueOf((String) parameterList.get(2)));
        cylinder.setThetamax(Double.valueOf((String) parameterList.get(3)));

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
        return cylinder;
    }

}
