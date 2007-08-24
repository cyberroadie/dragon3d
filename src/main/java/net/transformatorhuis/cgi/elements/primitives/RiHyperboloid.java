package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Hyperboloid;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISPec 3.2 page 79
 */
public class RiHyperboloid extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiHyperboloid.class);

    /**
     * JAXB Hyperboloid element
     */
    private Hyperboloid hyperboloid;

    /**
     * Hyperboloid.
     */
    public RiHyperboloid() {
        super();
    }

    /**
     * Hyperboloid.
     * @param parameters extra parameters
     */
    public RiHyperboloid(final String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        hyperboloid = objFactory.createHyperboloid();
        hyperboloid.setX1(Double.valueOf((String) parameterList.get(0)));
        hyperboloid.setY1(Double.valueOf((String) parameterList.get(1)));
        hyperboloid.setZ1(Double.valueOf((String) parameterList.get(2)));
        hyperboloid.setX2(Double.valueOf((String) parameterList.get(3)));
        hyperboloid.setY2(Double.valueOf((String) parameterList.get(4)));
        hyperboloid.setZ2(Double.valueOf((String) parameterList.get(5)));
        hyperboloid.setThetamax(Double.valueOf((String) parameterList.get(6)));

        if (parameterList.size() > 7) {
            setParameters(parameterList, 7);
        } else {
            setParameters(null, 0);
        }
        
    }

    public Object getJAXBNode() {
            return hyperboloid;
    }


}
