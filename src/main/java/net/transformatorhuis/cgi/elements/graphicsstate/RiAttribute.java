package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Attribute;
import java.util.Vector;

/**
 * @author cyberroadie
 *
 */
/**
 * @author cyberroadie
 *
 */
public class RiAttribute extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiAttribute.class);

    /**
     * JAXB Attribute element
     */
    private Attribute attribute;
    
    /**
     * Attribute.
     */
    public RiAttribute() {
        super();
    }

    /**
     * Attribute.
     * @param parameters extra parameters
     */
    public RiAttribute(String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        attribute = objFactory.createAttribute();
        attribute.setName((String) parameterList.get(0));

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
        return attribute;
    }

}
