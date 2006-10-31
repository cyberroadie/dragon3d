/**
 * 
 */
package net.transformatorhuis.teapot;

import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.Document;

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
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// creating the ObjectFactory
			objFactory = new ObjectFactory();
			rib = objFactory.createRib();
			rib.setVersion("3.03");
			
			List ribList = rib.getDisplayOrProjectionOrRotate();
			
			Display display = objFactory.createDisplay();
			display.setName("teapot.tiff");
			display.setType("file");
			display.setMode("rgb");
			ribList.add(display);
			
			Projection projection = objFactory.createProjection();
			projection.setName("perspective");
			ribList.add(projection);
			
			Translate translate = objFactory.createTranslate();
			translate.setDx(0);
			translate.setDy(0);
			translate.setDz(25);
			ribList.add(translate);
			
			Rotate rotate = objFactory.createRotate();
			rotate.setAngle(-22);
			rotate.setDx(1);
			rotate.setDy(0);
			rotate.setDz(0);
			ribList.add(rotate);
			
			Rotate rotate2 = objFactory.createRotate();
			rotate2.setAngle(19);
			rotate2.setDx(0);
			rotate2.setDy(1);
			rotate2.setDz(0);
			ribList.add(rotate2);
			
			Translate translate2 = objFactory.createTranslate();
			translate2.setDx(0);
			translate2.setDy(-3);
			translate2.setDz(25);
			ribList.add(translate2);
			
			World world = objFactory.createWorld();
			List worldList = world.getLightsourceOrSurfaceOrColor();
			
			Lightsource lightsource = objFactory.createLightsource();
			lightsource.setShadername("ambientlight");
			List lightsourceParamList = lightsource.getParam();
			Param param = objFactory.createParam();
			param.setName("intensity");
			param.setValue("0.4");
			lightsourceParamList.add(param);
			worldList.add(lightsource);
			
			ribList.add(world);
			
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
