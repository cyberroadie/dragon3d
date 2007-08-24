package net.transformatorhuis.cgi.elements.primitives;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.conversion.AbstractRibType;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.Disk;

import java.util.Vector;

/**
 * @author cyberroadie
 *
 * RISpec 3.2 page 80
 */
public class RiDisk extends AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RiDisk.class);

    /**
     * JAXB Disk element
     */
    private Disk disk;

    /**
     * Disk.
     */
    public RiDisk() {
        super();
    }

    /**
     * Disk.
     * @param parameters extra parameters
     */
    public RiDisk(final String parameters) {
        super(parameters);
        Vector parameterList = splitParameters(parameters);
        disk = objFactory.createDisk();
        disk.setHeight(Double.valueOf((String) parameterList.get(0)));
        disk.setRadius(Double.valueOf((String) parameterList.get(1)));
        disk.setThetamax(Double.valueOf((String) parameterList.get(2)));

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
        return disk;
    }

}
