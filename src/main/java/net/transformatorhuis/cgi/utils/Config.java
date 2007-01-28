package net.transformatorhuis.cgi.utils;

import org.apache.log4j.Logger;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Element;

import java.util.Vector;
import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Reads config file (RibElements.xml) out jar file. RibElements is automaticly
 * generated during compile time by ant which executes the ConfigGenerator
 * program. To prevent multiple instantiations of this class, this class
 * implements the Singelton Pattern.
 */
public final class Config {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(Config.class);

    /**
     * Instance flag.
     */
    private static boolean instanceFlag = false;

    /**
     * Document.
     */
    private Document document;

    /**
     * Rin hash table.
     */
    private Hashtable rib = new Hashtable();

    /**
     * Configurator.
     */
    private Config() {

        try {
            Class clazz = getClass();
            InputStream in = clazz.getResourceAsStream("/conf/RibElements.xml");
            parseConfigFile(in);
        } catch (Exception ex) {
            logger.error("Serious problem: " + ex.toString());
            logger.error("Automaticly generated config "
                        + "file during compile not found.");
        }

    }

    /**
     * @return instance flag
     */
    static public Config instance() {

        if (!instanceFlag) {
            instanceFlag = true;
            return new Config();
        } else {
            return null;
        }
    }

    /**
     * Returns names.
     * @return names
     */
    public Vector getNames() {
        return new Vector(rib.keySet());
    }

    /**
     * Returns hashtable with names mapped to package classnames
     */
    public Hashtable getClasses() {
        return rib;
    }

    /**
     * @param configFile
     */
    private void parseConfigFile(final InputStream configFile) {

        String ribElementName;
        String ribElementClassName;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(configFile);
        } catch (ParserConfigurationException pce) {
            logger.error(pce.toString());
        } catch (IOException ioe) {
            logger.error(ioe.toString());
        } catch (SAXException spe) {
            logger.error(spe.toString());
        } catch (IllegalArgumentException iae) {
            logger.error(iae.toString());
        } catch (Exception ex) {
            logger.error("Something else: " + ex.toString());
        }

        // Get the root
        Element root = document.getDocumentElement();

        // Get all the packages
        NodeList ribPackages = root.getElementsByTagName("package");

        // Loop through all the packages
        for (int i = 0; i < ribPackages.getLength(); i++) {

            Node ribPackage = ribPackages.item(i);

            NodeList ribElements = ribPackage.getChildNodes();
            String packageName = ribPackage.getAttributes()
                    .getNamedItem("name").getNodeValue();

            logger.debug("Package: " + packageName);

            // Loop through all elements in this package
            for (int x = 0; x < ribElements.getLength(); x++) {

                // Get values
                Node ribElement = ribElements.item(x);

                if (ribElement.getNodeType() == Node.ELEMENT_NODE) {
                    NamedNodeMap ribElementAttributes = ribElement
                            .getAttributes();
                    ribElementName = ribElementAttributes.getNamedItem("name")
                            .getNodeValue();
                    ribElementClassName = ribElementAttributes.getNamedItem(
                            "classname").getNodeValue();
                    rib.put(ribElementName,
                            (packageName + "." + ribElementClassName));
                    logger.debug("Class name: " + ribElementClassName);
                }

            }

        }

    }

}
