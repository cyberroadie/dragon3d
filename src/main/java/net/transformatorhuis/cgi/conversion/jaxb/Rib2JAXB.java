package net.transformatorhuis.cgi.conversion.jaxb;

import net.transformatorhuis.xsd.ObjectFactory;
import net.transformatorhuis.xsd.Rib;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * @author cyberroadie
 */
public class Rib2JAXB {

    private Rib rib;

    private List<Object> ribList;

    private RIBElementFactory ribElementFactory;

    private Marshaller m;
    
    private static Logger logger = Logger.getLogger(Rib2JAXB.class);

    private File ribFile;

    private String version;

    /**
     * Converts RIB to JAXB.
     * @param ribFile RIB input file
     */
    public Rib2JAXB(File ribFile) {
        super();

        this.ribFile = ribFile;

        // Create thr RIB factory
        ribElementFactory = new RIBElementFactory();

        // First create the JAXB container
        try {
            JAXBContext jc = JAXBContext.newInstance("net.transformatorhuis.xsd");
            m = jc.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        } catch (PropertyException e) {
            logger.error(e.toString());
        } catch (JAXBException e) {
            logger.error(e.toString());
        }

        // JAXB object factory
        ObjectFactory objFactory = new ObjectFactory();

        // Intial setup renderman file
        rib = objFactory.createRib();
        rib.setVersion("3.03");
        ribList = rib.getWorldOrDisplayOrAttributestack();

    }

    /**
     * @param args additional arguments
     */
    public static void main(final String[] args) {

        // Setup logging
        BasicConfigurator.configure();
        Rib2JAXB rib2jaxb = new Rib2JAXB(new File(args[0]));
        try {
            rib2jaxb.createJAXBCloud();
        } catch (InvalidRIBDocumentException e) {
            logger.error(e.toString());
            System.exit(1);
        }

        // Try printing it to standard output
        try {
            rib2jaxb.toSystemOut();
        } catch (JAXBException e) {
            logger.error(e.toString());
        }

    }

    /**
     * This method sequentially adds RIB elements to the JAXB Cloud
     * Note this could be transformed to a paralel process?
     * @throws net.transformatorhuis.cgi.conversion.jaxb.InvalidRIBDocumentException Invalid RIB document format
     */
    public void createJAXBCloud() throws InvalidRIBDocumentException {
        try {
            BufferedReader in = new BufferedReader(new FileReader(ribFile));
            String str;
            // First find version line
            while ((str = in.readLine()) != null) {
                if(!str.startsWith("#")) {
                    if(str.trim().startsWith("version")) {
                        setVersion(str.substring(str.indexOf(" ")));
                        break;
                    } else {
                        throw new InvalidRIBDocumentException("No version number found");
                    }
                }


            }

            while ((str = in.readLine()) != null) {
                // No whitespace
                str = str.trim();
                // TODO trim comments from end of line
                // TODO give 'version 3.03' (Rib attribute) it's own implementation/setter
                if(!str.startsWith("#") && !str.trim().equals("")) {
                    logger.debug("Processing: " + str);
                    process(str);
                }
            }
            in.close();
        } catch (IOException e) {
            logger.error(e.toString());
        }
    }

    private void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    /**
     * Adds RIB element to the JAXB cloud
     * @param paramaters RIB element parameters
     */
    private void process(String paramaters)  {

        Object rib = ribElementFactory.processRIBLine(paramaters);
        System.out.println();
        ribList.add(rib);

    }

    /**
     * Returns the current state (snapshot) of the JAXB cloud as a DOM document
     *
     * @return DOM document
     */
    public Document getDOMDocument() {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db;
        Document doc = null;
        try {
            db = dbf.newDocumentBuilder();
            doc = db.newDocument();
            m.marshal(rib, doc);
        } catch (ParserConfigurationException e) {
            logger.error(e.toString());
        } catch (JAXBException e) {
            logger.error(e.toString());
        }

        return doc;

    }

    /**
     * Prints JAXB to System.out
     * @throws JAXBException error creating JAXB output
     */
    public void toSystemOut() throws JAXBException {
        m.marshal(rib, System.out);
    }

}
