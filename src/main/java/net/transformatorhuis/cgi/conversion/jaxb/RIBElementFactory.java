package net.transformatorhuis.cgi.conversion.jaxb;

import net.transformatorhuis.cgi.utils.Config;
import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.xsd.ObjectFactory;
import net.transformatorhuis.xsd.Rib;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

/**
 * @author cyberroadie
 */
public class RIBElementFactory {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RIBElementFactory.class);

    /**
     * Classes.
     */
    private Hashtable classes;

    public RIBElementFactory() {

        // Create the configurator which contains the RIB mapping to RIB class names
        Config config = Config.instance();

        /* Hashtable for rib element name to class mapping */
        classes = config.getClasses();

        /* JAXB object factory */
        ObjectFactory objectFactory = new ObjectFactory();

    }

    public Object processRIBLine(String ribLine) {

        AbstractRib rib = null;

        Class[] intArgsClass = new Class[] {String.class};
        Object[] intArgs = new Object[] {ribLine};

        System.out.println("RIB line: " + ribLine);
        String ribElementName;
        try {
            ribElementName = ribLine.substring(0, ribLine.indexOf(' '));
        } catch (StringIndexOutOfBoundsException e) {
            ribElementName = ribLine.trim();            
        }
        logger.info("RIB element name: " + ribElementName);

        // Get the corresponding class from hashtable based on ribElementName
        try {
            String packageclassName = (String) classes.get(ribElementName);
            Class ribClass = Class.forName(packageclassName,
                    true, this.getClass().getClassLoader());
            // Instantiate the new rib ribElementName
            rib = (AbstractRib) ribClass.getConstructor(intArgsClass)
                    .newInstance(intArgs);

        } catch (ClassNotFoundException e) {
            logger.error(e.toString());
        } catch (InvocationTargetException e) {
            logger.error(e.toString());
        } catch (NoSuchMethodException e) {
            logger.error(e.toString());
        } catch (IllegalAccessException e) {
            logger.error(e.toString());
        } catch (InstantiationException e) {
            logger.error(e.toString());
        }

        return rib.getJAXBNode();
        
    }

}
