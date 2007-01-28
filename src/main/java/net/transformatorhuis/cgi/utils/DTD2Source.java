package net.transformatorhuis.cgi.utils;

import java.net.URL;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * @author mgs
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class DTD2Source {

    /**
     * Logger.
     */
    static Logger logger = Logger.getLogger(DTD2Source.class);

    /**
     * Converts DTD to source
     */
    public DTD2Source() {

        /* Configure log4j, read conf out of jar file */
        Class clazz = getClass();
        URL url = clazz.getResource("/conf/log4j.xml");
        DOMConfigurator.configure(url);

    }

    /**
     * Main method
     * @param args additional paramters
     */
    public static void main(final String[] args) {

    }

}
