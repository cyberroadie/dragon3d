package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Attributestack;

/**
 * RiAttributeEnd.
 * @author cyberroadie
 *
 * RISpec 3.2 page 38
 */
public class RiAttributeEnd extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiAttributeEnd.class);

    /**
     * JAXB AttributeEndmelement
     */
    private Attributestack attributestack;

    /**
     * AttributeEnd.
     */
    public RiAttributeEnd() {
        super();
    }

    /**
     * AttributeEnd.
     * @param param extra parameters
     */
    public RiAttributeEnd(final String param) {
        super(param);
        
    }

    /**
     * @return Is an end element.
     */
    public final boolean isEndElement() {
        return true;
    }

    /**
     * Abstract method to return
     *
     * @return JAXB node returned for RIB element
     */
    public Object getJAXBNode() {
        return null;
    }

}
