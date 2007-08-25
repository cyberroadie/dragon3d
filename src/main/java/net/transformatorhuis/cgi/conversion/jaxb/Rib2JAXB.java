package net.transformatorhuis.cgi.conversion.rib;

import net.transformatorhuis.xsd.Rib;
import net.transformatorhuis.xsd.ObjectFactory;
import net.transformatorhuis.cgi.conversion.jaxb.RIBElementFactory;
import net.transformatorhuis.cgi.utils.Config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

/**
 * @author cyberroadie
 */
public class Rib2JAXB {

    private Rib rib;

    private List ribList;

    private List ribElementsList;

    private ObjectFactory objFactory;

    private RIBElementFactory ribElementFactory;

    private Marshaller m;
    
    private static Logger logger = Logger.getLogger(Rib2JAXB.class);

    private File ribFile;

    private static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    private static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
    private static final String JAXP_SCHEMA_SOURCE = "http://java.sun.com/xml/jaxp/properties/schemaSource";

    /**
     * Converts RIB to JAXB.
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
        objFactory = new ObjectFactory();

        // Intial setup renderman file
        rib = objFactory.createRib();
        rib.setVersion("3.03");
        ribList = rib.getDisplayOrAttributeOrProjection();

    }

    /**
     * @param args additional arguments
     */
    public static void main(final String[] args) {

        // Setup logging
        BasicConfigurator.configure();
        Rib2JAXB rib2jaxb = new Rib2JAXB(new File(args[0]));
        rib2jaxb.createJAXBCloud();

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
     */
    public void createJAXBCloud() {
        try {
            BufferedReader in = new BufferedReader(new FileReader(ribFile));
            String str;
            while ((str = in.readLine()) != null) {
                // TODO give version it's own implementation/setter
                if(!str.startsWith("#") && !str.startsWith("version") && !str.trim().equals("")) {
                    logger.debug("Processing: " + str);
                    process(str);
                }
            }
            in.close();
        } catch (IOException e) {
            logger.error(e.toString());
        }
    }

    /**
     * Adds RIB element to the JAXB cloud
     * @param paramaters
     */
    private void process(String paramaters)  {

        Object rib = ribElementFactory.processRIBLine(paramaters);
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
        DocumentBuilder db = null;
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
     * @throws JAXBException
     */
    public void toSystemOut() throws JAXBException {
        m.marshal(rib, System.out);
    }

}
