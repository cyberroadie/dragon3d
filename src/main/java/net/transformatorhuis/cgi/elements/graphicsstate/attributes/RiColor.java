package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Color;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 38
 */
public class RiColor extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiColor.class);

    /**
     * JAXB Color element 
     */
    private Color color;

    /**
     * Color.
     */
    public RiColor() {
        super();
    }

    /**
     * Color.
     * @param parameters extra parameters
     */
    public RiColor(String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        parameterList = splitParameters(((String) parameterList.get(0)).substring(1).replace(']',' '));
        color = objFactory.createColor();
        color.setR((String) parameterList.get(0));
        color.setG((String) parameterList.get(1));
        color.setB((String) parameterList.get(2));

        // TODO: Refactor this away by counting set methods via reflection
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
        return color;
    }

}
