/**
 * 
 */
package net.transformatorhuis.teapot;

import java.io.File;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;

/**
 * @author cyberroadie
 * 
 */
public class DrinkTea {

    /**
     * Logger.
     */
    private static Logger logger;
    
    /**
     * Drink tea.
     */
    protected DrinkTea() {
        super();
    }

    /**
     * @param args additional arguments
     */
    public static void main(String[] args) {

        logger = Logger.getLogger(DrinkTea.class);
        Teapot teapot = null;

        try {
            teapot = new Teapot();
            teapot.toSystemOut();
            Document doc = teapot.toDOM();
            writeFile(doc);
        } catch (BrokenTeapotException e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("Result: " + teapot.toString());

    }

    /**
     * Write XML file.
     * @param doc xml document
     */
    public static void writeFile(Document doc) {
        Source source = new DOMSource(doc);
        File file = new File("teapot.xml");
        Result result = new StreamResult(file);

        Transformer xformer;
        try {
            xformer = TransformerFactory.newInstance().newTransformer();
            xformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            System.out.println(e.toString());
        } catch (TransformerFactoryConfigurationError e) {
            System.out.println(e.toString());
        } catch (TransformerException e) {
            System.out.println(e.toString());
        }
    }

}
