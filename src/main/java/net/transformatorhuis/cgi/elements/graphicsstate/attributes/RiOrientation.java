package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Orientation;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 54
 */
public class RiOrientation extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiOrientation.class);

    /**
     * JAXB orientation element
     */
    Orientation orientation;

    /**
     * Orientation.
     */
    public RiOrientation() {
        super();
    }

    /**
     * Orientation.
     * @param parameters extra parameters
     */
    public RiOrientation(String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        orientation = objFactory.createOrientation();
        orientation.setOrientation((String) parameterList.get(0));

        if (parameterList.size() > 1) {
            setParameters(parameterList, 1);
        } else {
            setParameters(null, 0);
        }

    }

    public Object getJAXBNode() {
        return orientation;
    }

}
