package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Torus;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 83
 */
public class RiTorus extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTorus.class);

    /**
     * JAXB Torus element
     */
    private Torus torus;
    
    /**
     * Torus.
     */
    public RiTorus() {
        super();
    }

    /**
     * Torus.
     * @param parameters extra parameters
     */
    public RiTorus(final String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        torus = objFactory.createTorus();
        torus.setMajorradius(Double.valueOf((String) parameterList.get(0)));
        torus.setMinorradius(Double.valueOf((String) parameterList.get(1)));
        torus.setPhiminus(Double.valueOf((String) parameterList.get(2)));
        torus.setPhimax(Double.valueOf((String) parameterList.get(3)));
        torus.setThetamax(Double.valueOf((String) parameterList.get(4)));

        if (parameterList.size() > 5) {
            setParameters(parameterList, 5);
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
        return torus;
    }

}
