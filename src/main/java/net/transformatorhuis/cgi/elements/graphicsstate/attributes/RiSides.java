package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Sides;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 55
 */
public class RiSides extends AbstractRib {

    /**
     * Logger. 
     */
    private static Logger logger = Logger.getLogger(RiSides.class);

    /**
     * JAXB sides element;
     */
    Sides sides;

    /**
     * Sides.
     */
    public RiSides() {
        super();
    }

    /**
     * Sides.
     * @param parameters extra parameters
     */
    public RiSides(final String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        sides = objFactory.createSides();
        // TODO this is actually a RtInt instead of string, change in xml schema
        sides.setSides((String) parameterList.get(0));

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
        return sides;
    }

}
