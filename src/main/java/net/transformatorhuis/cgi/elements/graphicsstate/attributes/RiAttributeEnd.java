package net.transformatorhuis.cgi.elements.graphicsstate.attributes;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.Rib;

/**
 * RiAttributeEnd.
 * @author cyberroadie
 *
 */
public class RiAttributeEnd extends Rib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiAttributeEnd.class);

    /**
     * AttributeEnd.
     */
    public RiAttributeEnd() {
        super();
    }

    /**
     * AttributeEnd.
     * @param param
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

}
