package net.transformatorhuis.cgi.conversion.rib;

import net.transformatorhuis.xsd.Rib;
import net.transformatorhuis.xsd.ObjectFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.JAXBException;

/**
 * @author cyberroadie
 */
public class Rib2JAXB {

    private Rib rib;

    private List ribList;

    private List ribElementsList;

    private ObjectFactory objFactory;

    private Marshaller m;
    
    private static Logger logger = Logger.getLogger(Rib2JAXB.class);

    private static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    private static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
    private static final String JAXP_SCHEMA_SOURCE = "http://java.sun.com/xml/jaxp/properties/schemaSource";

    /**
     * Converts RIB to JAXB.
     */
    public Rib2JAXB() {
        super();

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

    }


    public void createJAXBCloud() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("infilename"));
            String str;
            while ((str = in.readLine()) != null) {
                process(str);
            }
            in.close();
        } catch (IOException e) {

        }
    }

    private void process(String paramaters)  {

        //ribList.add(jaxbNode);

    }
    /**
     * @return true
     */
    public boolean test() {
        return true;
    }

}
