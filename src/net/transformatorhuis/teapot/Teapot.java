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
		/* First
		 *  try to get it out of jar file */
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
			// creating the ObjectFactory
			objFactory = new ObjectFactory();
			rib = objFactory.createRib();
			rib.setVersion("1.0");
			
		} catch (JAXBException e) {
			throw new BrokenTeapotException(e.toString());
		}
		
	}
	
	public Rib createRib() {
		
		return null;
	}
	
	public World createWorld() {
		
		return null;
	}
	
	public Attributestack createSpout() {
		
		return null;
	}
	
	public Attributestack createHandle() {
		
		return null;
	}

	public Attributestack createBody() {
		
		return null;
	}
	
	public Attributestack createTop() {
		
		return null;
	}
	
	public Document toDOM() {
	
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
	
	public String toString() {
		
		try {
			m = jc.createMarshaller();
			m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
			m.marshal( rib, toDOM() );
		} catch (JAXBException e) {
			logger.error(e.toString());
		}
		
		return null;
	}
	
}
