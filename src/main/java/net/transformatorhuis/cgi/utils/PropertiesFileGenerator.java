package net.transformatorhuis.cgi.utils;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Iterator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Utilty class the generate a proprties file which maps the java classes
 * to their corresponding RIB elements
 * @author cyberroadie
 */
public class PropertiesFileGenerator {

    /**
     * Logger
     */
    public Logger logger = Logger.getLogger(PropertiesFileGenerator.class);

    /**
     * HashMap for storing the key / values
     */
    private HashMap<String, String> propertiesMap = new HashMap();

    /**
     * Default Maven Java source directory
     */
    private static final String SRC_DIR = "./src/main/java";

    /**
     * Default Maven resource directory
     */
    private static final String RESOURCES_DIR = "./src/main/resources";

    /**
     * Properties file for storing all the RIB elements
     */
    private static final String RIB_ELEMENT_FILE_NAME = "ribelement.properties";

    /**
     * Generates the proprty file
     * @param baseDir directory to traverse from
     * @throws IOException file can not be written
     */
    public void generateFile(File baseDir) throws IOException {
        this.traverseDirectories(baseDir.listFiles());
        File file = new File(RESOURCES_DIR + "/" + RIB_ELEMENT_FILE_NAME);
        FileWriter fw = new FileWriter(file);

        for (String key : propertiesMap.keySet()) {
            String value = propertiesMap.get(key);
            logger.debug("Writing to file: " + key + "=" + value);
            fw.write(key + "=" + value + "\n");
        }

        fw.flush();
        fw.close();
        
    }

    /**
     * traverses a directory
     * @param directory directory to traverse
     */
    private void traverseDirectories(File directory[]) {

        for (File aDirectory : directory) {
            if (aDirectory.isDirectory()) {
                logger.debug(aDirectory.getPath());
                if (!aDirectory.isHidden()) {
                    traverseDirectories(aDirectory.listFiles());
                }
            } else {
                // Only get the java file starting with 'Ri'
                if (aDirectory.getName().endsWith(".java") && aDirectory.getName().startsWith("Ri")) {
                    logger.debug("Adding: " + aDirectory.getName());
                    this.add(aDirectory);
                }
            }
        }
    }

    private void add(File javaFile) {

        logger.debug("Adding: " + javaFile.getPath().substring(SRC_DIR.length()) + " - " + javaFile.getName());
        propertiesMap.put(javaFile.getPath().substring(SRC_DIR.length()).replace("/", ".")
                .replaceAll(".java", "").substring(1),
                javaFile.getName().substring(2).replaceAll(".java", ""));

    }

    public static void main(final String argv[]) {

        // Get logging configured
        DOMConfigurator.configure("src/conf/log4j.xml");

        PropertiesFileGenerator pfg = new PropertiesFileGenerator();

        try {
            pfg.generateFile(new File(SRC_DIR));
        } catch (IOException e) {
            System.out.println("Can not write file: " + e.toString());
            System.exit(1);
        }

    }
}
