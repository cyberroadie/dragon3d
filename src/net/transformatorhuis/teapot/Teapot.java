/**
 * 
 */
package net.transformatorhuis.teapot;

import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.Document;

import com.sun.xml.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import net.transformatorhuis.xsd.*;
/**
 * 
 * This class will create will create Teapot.xml 'staticly' via jaxb.
 * 
 * @author cyberroadie
 *
 */
public class Teapot {

	Logger logger;
	JAXBContext jc;
	ObjectFactory objFactory;
	Rib rib;
	Marshaller m;
	
	public Teapot() throws BrokenTeapotException {
		logger = Logger.getLogger(Teapot.class);
		/* First try to get it out of jar file */
		Class clazz = getClass();
        URL url = clazz.getResource("/conf/log4j.xml");
        if(url == null) {
        		/* Try reading from working directory */
        		try {
        			DOMConfigurator.configure("conf/log4j.xml");
        		} catch (Exception e) {
        			throw new BrokenTeapotException("Error: Configuration file for Log4j (log4j.xml) not found: " + e.toString());
        		}
        } else {
        		DOMConfigurator.configure(url);
        }
        
        try {
			jc = JAXBContext.newInstance( "net.transformatorhuis.xsd" );
			m = jc.createMarshaller();
			// creating the ObjectFactory
			objFactory = new ObjectFactory();
			rib = objFactory.createRib();
			rib.setVersion("3.03");
			
			Display display = objFactory.createDisplay();
			display.setName("teapot.tiff");
			display.setType("file");
			display.setMode("rgb");
	
			
		} catch (JAXBException e) {
			throw new BrokenTeapotException(e.toString());
		} catch (Exception e) {
			throw new BrokenTeapotException("Error in Teapot constructor: " + e.toString());
		}
		
	}
	
	public Document toDOM() throws BrokenTeapotException {
	
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = null;
        Document doc = null;
		try {
			db = dbf.newDocumentBuilder();
			doc = db.newDocument();
			m.marshal(rib, doc);
		} catch (ParserConfigurationException e) {
			throw new BrokenTeapotException(e.toString());
		} catch (JAXBException e) {
			throw new BrokenTeapotException(e.toString());
		} catch (Exception e) {
			throw new BrokenTeapotException("Error in toDOM(): " + e.toString());
		}
		
		return doc;
	}
	
	public void toSystemOut() throws BrokenTeapotException {
		
		try {
			m.marshal(rib, System.out);
		} catch (JAXBException e) {
			throw new BrokenTeapotException(e.toString());
		} catch (Exception e) {
			throw new BrokenTeapotException(e.toString());
		}
		
	}
		
}
