package net.transformatorhuis.cgi.conversion;

import org.apache.log4j.Logger;
import net.transformatorhuis.cgi.utils.Config;
import java.lang.reflect.*;
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
    
    /* All names of rib classes are in config */
    public RibFactory(Config config) {
        
        classes = config.getClasses();
    
    }

    /**
     * This processes a rib element.
     * @param ribLine
     */
    public void processRibElement(String ribLine) {
    
    	logger.debug("Factory input: " + ribLine);
        String element = null;
        String param;
        Class ribElement;
        Class[] intArgsClass;
        Object[] intArgs;
        Class ribElementDefinition;
        Rib rib = null;
        
        int c = ribLine.indexOf(' ');
        if(c != -1) {
            // With params
            param = ribLine.substring(c, ribLine.length()); // Get rid of the EOL ('\r')
            element = ribLine.substring(0, c);
            intArgsClass = new Class[] {String.class}; 
            intArgs = new Object[] {param};

        } else {
            // No params
            element = ribLine; //.substring(0, ribLine.length()); // Get rid of the EOL ('\r')
            intArgsClass = new Class[] {}; 
            intArgs = null;
        }
             
        try {   
            ribElementDefinition = Class.forName((String) classes.get(element), true, this.getClass().getClassLoader());
            
            // Instantiate the new rib element
            rib = (Rib) ribElementDefinition.getConstructor(intArgsClass).newInstance(intArgs);
            
            // Give the rib element to RibDocument which knows what to do with it
            RibDocument ribDoc = RibDocument.newInstance();
            ribDoc.doJob(rib);
           
        } catch (InstantiationException ie) {
            System.out.println(ie);
        } catch (IllegalAccessException iae) {
            System.out.println(iae);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae);
        } catch (InvocationTargetException ite) {
            System.out.println(ite);
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe);
        } catch (NoSuchMethodException nsme) {
            System.out.println(nsme);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
}
