package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Projection;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 25
 */
public class RiProjection extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiProjection.class);

    /**
     * JAXB Projection element
     */
    private Projection projection;

    /**
     * Projection.
     * @param parameters extra parameters
     */
    public RiProjection(String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        projection = objFactory.createProjection();
        projection.setName((String) parameterList.get(0));

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
        return projection;
    }

}
