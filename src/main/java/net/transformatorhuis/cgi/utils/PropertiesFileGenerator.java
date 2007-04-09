package net.transformatorhuis.cgi.utils;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author cyberroadie
 */
public class PropertiesFileGenerator {

    public Logger logger = Logger.getLogger(PropertiesFileGenerator.class);

    private HashMap<String, String> propertiesMap = new HashMap();

    private static final String SRC_DIR = "./src/main/java";
    
    private static final String RESOURCES_DIR = "./src/main/resources";
    
    private static final String RIB_ELEMENT_FILE_NAME = "ribelement.properties";

    public PropertiesFileGenerator() {
    }

    public void generateFile(File baseDir) throws IOException {
        this.traverseDirectories(baseDir.listFiles());
        File file = new File(RESOURCES_DIR + "/" + RIB_ELEMENT_FILE_NAME);
        FileWriter fw = new FileWriter(file);

        for (Iterator<String> iterator = propertiesMap.keySet().iterator(); iterator.hasNext();) {
            String key = iterator.next();
            String value = propertiesMap.get(key);
            logger.debug("Writing to file: " + key + "=" + value);
            fw.write(key + "=" + value + "\n");
        }

        fw.flush();
        fw.close();
        
    }

    private void traverseDirectories(File dir[]) {

        for (int i = 0; i < dir.length; i++) {
            if (dir[i].isDirectory()) {
                logger.debug(dir[i].getPath());
                if (!dir[i].isHidden()) {
                    traverseDirectories(dir[i].listFiles());
                }
            } else {
                // Only get the java file starting with 'Ri'
                if (dir[i].getName().endsWith(".java") && dir[i].getName().startsWith("Ri")) {
                    logger.debug("Adding: " + dir[i].getName());
                    this.add(dir[i]);
                }
            }
        }
    }

    private void add(File javaFile) {

        logger.debug("Adding: " + javaFile.getPath().substring(SRC_DIR.length()) + " - " + javaFile.getName());
        propertiesMap.put(javaFile.getName().substring(2).replaceAll(".java", ""),
                javaFile.getPath().substring(SRC_DIR.length()).replace("/", ".")
                .replaceAll(".java", "").substring(1));

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
