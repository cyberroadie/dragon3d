package net.transformatorhuis.cgi.elements.graphicsstate;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.World;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 17
 */
public class RiWorldBegin extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiWorldBegin.class);

    /**
     * JAXB world element
     */
    private World world;

    /**
     * World start element.
     */
    public RiWorldBegin() {
        super();
    }

    /**
     * World start element.
     * @param parameters extra parameters
     */
    public RiWorldBegin(String parameters) {
        super(parameters);
        world = objFactory.createWorld();

    }

    /**
     * Has child elements.
     * @return true
     */
    public boolean hasChildElements() {
        return true;
    }

    /**
     * Abstract method to return
     *
     * @return JAXB node returned for RIB element
     */
    public Object getJAXBNode() {
        return world;
    }

}
