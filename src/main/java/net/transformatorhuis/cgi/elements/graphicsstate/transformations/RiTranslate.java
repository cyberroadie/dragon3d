package net.transformatorhuis.cgi.elements.graphicsstate.transformations;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Translate;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 57
 */
public class RiTranslate extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiTranslate.class);

    /**
     * JAXB translate element
     */
    private Translate translate;

    /**
     * Translate.
     */
    public RiTranslate() {
        super();
    }

    /**
     * Translate.
     * @param parameters extra parameters
     */
    public RiTranslate(final String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        translate = objFactory.createTranslate();
        translate.setDx(Double.valueOf((String) parameterList.get(0)));
        translate.setDy(Double.valueOf((String) parameterList.get(1)));
        translate.setDz(Double.valueOf((String) parameterList.get(2)));

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
        return translate;
    }

}
