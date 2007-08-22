package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Scale;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 58
 */
public class RiScale extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiScale.class);

    /**
     * JAXB Scale element;
     */
    private Scale scale;
    
    /**
     * Scale.
     */
    public RiScale() {
        super();
    }

    /**
     * Scale.
     * @param parameters extra parameters
     */
    public RiScale(String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        scale = objFactory.createScale();
        scale.setSx(Double.valueOf((String) parameterList.get(0)));
        scale.setSy(Double.valueOf((String) parameterList.get(1)));
        scale.setSz(Double.valueOf((String) parameterList.get(2)));

        if (parameterList.size() > 3) {
            setParameters(parameterList, 3);
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
        return scale;
    }

}
