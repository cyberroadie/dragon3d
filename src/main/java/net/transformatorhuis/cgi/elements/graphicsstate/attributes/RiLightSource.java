package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Lightsource;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 4.2.3 page 41
 */
public class RiLightSource extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiLightSource.class);

    /**
     * JAXB lightsource element
     */
    Lightsource lightsource;
    
    /**
     * LightSource.
     */
    public RiLightSource() {
        super();
    }

    /**
     * LightSource.
     * @param parameters extra parameter
     */
    public RiLightSource(String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        lightsource = objFactory.createLightsource();
        lightsource.setShadername((String) parameterList.get(0));
        lightsource.setSequencenumber(Integer.valueOf((String) parameterList.get(1)));

        if (parameterList.size() > 2) {
            setParameters(parameterList, 2);
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
        return lightsource;
    }

}
