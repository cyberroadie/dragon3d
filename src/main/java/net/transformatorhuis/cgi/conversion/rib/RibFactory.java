package net.transformatorhuis.cgi.conversion.rib;

import net.transformatorhuis.cgi.conversion.AbstractRib;
import net.transformatorhuis.cgi.utils.Config;
import net.transformatorhuis.xsd.ObjectFactory;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

/**
 * @author cyberroadie
 *
 */
public class RibFactory {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(RibFactory.class);

    /**
     * Classes.
     */
    private Hashtable classes;

    /**
     * Factory. All names of rib classes are in config.
     *
     * @param config
     *            configuration
     */
    public RibFactory(final Config config) {

        /* Hashtable for rib element name to class mapping */
        classes = config.getClasses();

        /* JAXB object factory */
        ObjectFactory objFactory = new ObjectFactory();

    }

    /**
     * This processes a rib element.
     *
     * @param ribLine one line of a rib file
     */
    public final void processRibElement(final String ribLine) {

        logger.debug("Factory input: " + ribLine);
        String ribElementName = null;
        String param;
        Class ribElement;
        Class[] intArgsClass;
        Object[] intArgs;
        Class ribElementDefinition;
        AbstractRib rib = null;

        int c = ribLine.indexOf(' ');
        if (c != -1) {
            // With params
            // Get rid of the EOL ('\r')
            param = ribLine.substring(c, ribLine.length()); 

            // Get the RIB element name
            ribElementName = ribLine.substring(0, c);
            intArgsClass = new Class[] {String.class};
            intArgs = new Object[] {param};

        } else {
            // No params
//          .substring(0, ribLine.length()); Get rid of the EOL ('\r')
            ribElementName = ribLine;
                                
            intArgsClass = new Class[] {};
            intArgs = null;
        }

        try {
            /* Get the corresponding class from hashtable based on ribElementName */
            /* TODO change this into properties mapping */
            ribElementDefinition = Class.forName((String) classes.get(ribElementName),
                    true, this.getClass().getClassLoader());

            /* Instantiate the new rib ribElementName*/
            rib = (AbstractRib) ribElementDefinition.getConstructor(intArgsClass)
                    .newInstance(intArgs);

            /* Give the rib ribElementName to RibDocument which knows what to do with it*/
            RibDocument ribDoc = RibDocument.newInstance();
            ribDoc.doJob(rib);

            // TODO replace System.out's with log4j 
        } catch (InstantiationException ie) {
            System.out.println("RibFactory error: " + ie);
        } catch (IllegalAccessException iae) {
            System.out.println("RibFactory error: " + iae);
        } catch (IllegalArgumentException iae) {
            System.out.println("RibFactory error: " + iae);
        } catch (InvocationTargetException ite) {
            System.out.println("RibFactory error: " + ite);
        } catch (ClassNotFoundException cnfe) {
            System.out.println("RibFactory error: " + cnfe);
        } catch (NoSuchMethodException nsme) {
            System.out.println("RibFactory error: " + nsme);
        } catch (Exception e) {
            System.out.println("RibFactory error: " + e);
        }

    }

}
