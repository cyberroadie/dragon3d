/* 
   +----------------------------------------------------------------------+
   | RendermanXML                                                         |
   +----------------------------------------------------------------------+
   | Copyright (c) 2004 Cyberroadie                                       |
   +----------------------------------------------------------------------+
   | This source file is subject to version 2 of the GNU General Public   |
   | License, that is bundled with this package in the file LICENSE.      |
   |                                                                      |
   | This program is free software; you can redistribute it and/or modify |
   | it under the terms of the GNU General Public License as published by |
   | the Free Software Foundation; either version 2 of the License, or    |
   | (at your option) any later version.                                  |
   |                                                                      |
   | This program is distributed in the hope that it will be useful,      |
   | but WITHOUT ANY WARRANTY; without even the implied warranty of       |
   | MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the        |
   | GNU General Public License for more details.                         |
   |                                                                      |
   | You should have received a copy of the GNU General Public License    |
   | along with this program; if not, write to the Free Software          |
   | Foundation, Inc., 59 Temple Place, Suite 330, Boston,                |
   | MA  02111-1307  USA                                                  |
   |                                                                      |
   +----------------------------------------------------------------------+
   | Author: Olivier Van Acker <cyberroadie@yahoo.co.uk>                  |
   +----------------------------------------------------------------------+
*/
package net.transformatorhuis.cgi.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Hashtable;
import java.util.Vector;
import java.util.Enumeration;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.dom.DOMSource; 
import javax.xml.transform.stream.StreamResult;
 
/**
 * Tool to create an xml config file which lists all the 
 * elements in a specified directory (recursivly).
 * This tool is specificly meant for usage by the ant tool
 * to create a config file after compiling which can then be 
 * stored in the jar file and used by various programs like
 * the RibFactory to lookup package/class names or Rib2Xml 
 * to have a list of (rib element) keywords. 
 * So if class files are added or removed the config file 
 * stays correct.
 *
 * TODO:
 * - Get extra info out of class files via refactoring
 * - Split up in Creator an Writer ?
 */
public class ConfigGenerator {

	static Logger logger = Logger.getLogger(ConfigGenerator.class);

    private File configOutput;
    private Document configDoc;
    private Hashtable dirContent;
    
    
    public ConfigGenerator() {
        DocumentBuilderFactory docBuilderFac = DocumentBuilderFactory.newInstance();
        dirContent = new Hashtable();
        
        try {
            DocumentBuilder docBuilder = docBuilderFac.newDocumentBuilder();
            configDoc = docBuilder.newDocument();
        } catch (ParserConfigurationException ex) { } // No exception, empty document is created
        
    }

    public static void main(String[] argv) {

        //BasicConfigurator.configure();
        
        //logger.setLevel(Level.DEBUG);
        
        DOMConfigurator.configure("./conf/log4j.xml");
        
        // is there anything to do?
        if (argv.length < 2) {
            printUsage();
            System.exit(1);
        }

        try {
            ConfigGenerator configGenerator = new ConfigGenerator();
            File baseDir = new File(argv[1]);
            configGenerator.createDirContent(baseDir.listFiles(), baseDir.toString());
            configGenerator.createConfigDoc(new File(argv[0]));
        } catch (Exception confEx) {
            System.out.println("Invalid config file name: " + argv[0]);
            System.out.println(confEx.toString());
            printUsage();
            System.exit(1);
        }

    }

    /**
     * Scans all directories for files, 
     * if directory is encountered it calls itself
     */
    private void createDirContent(File[] dir, String key) {
        
        logger.debug("Length: " + dir.length);
        
        for(int i = 0; i < dir.length; i++) {
            if(dir[i].isDirectory()) {
                logger.debug(dir[i].getPath());
                createDirContent(dir[i].listFiles(), dir[i].getPath());
            } else {
                logger.debug(dir[i].getName());
                add(key, dir[i].getName());
            }
        }
        
    }
    
    /**
     * Adds key to dirContent hashtable and the key
     * is linked to a vector (which thus can store multiple keys).
     */
    private void add(String key, String value) {
    
        if(dirContent.containsKey(key)) { // Mapping a value to existing key
            Vector valueVec = (Vector) dirContent.get(key);
            valueVec.add(value);
            dirContent.remove(key);
            dirContent.put(key, valueVec);
        } else { // Adding a new key and value
            Vector valueVec = new Vector();
            valueVec.add(value);
            dirContent.put(key, valueVec);
        }

    }
    
    /**
     * Loops through all values and store them in xml document
     * XML Structure:
     * <package name="....">
     *      <ribelement name="...." classname="...." />
     *      <ribelement name="...." classname="...." />
     *      ....
     * </package>
     * TODO:
     * - Validate with DTD?
     */
    private void createConfigDoc(File configFile) {
    
        Element root = configDoc.createElement("ribelements");
        
        // Loop through list of packages
        for(Enumeration keys = dirContent.keys(); keys.hasMoreElements();) {
        
            String key = (String) keys.nextElement();

            // Add package to document
            Element ribPackage = configDoc.createElement("package");
            ribPackage.setAttribute("name", key.replace('/','.'));
            
            // Get the rib elements from current package
            Vector valueVec = (Vector) dirContent.get(key);
            
            // Loop through list of rib elements 
            // and put them into current package
            for(Enumeration values = valueVec.elements(); values.hasMoreElements();) {
                String value = (String) values.nextElement();
                Element ribFile = configDoc.createElement("ribelement");
                
                // No Ri prefix and no .class extension
                ribFile.setAttribute("name", value.substring(2, value.lastIndexOf(".class")));
                
                // No .class extension
                ribFile.setAttribute("classname", value.substring(0, value.lastIndexOf(".class")));
                
                // Add rib element to corresponding package
                ribPackage.appendChild(ribFile);
            }
            
            root.appendChild(ribPackage);
        }
        
        configDoc.appendChild(root);
        
        try {
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
        
            DOMSource source = new DOMSource(configDoc);
            FileOutputStream fileOut = new FileOutputStream(configFile);
            StreamResult result = new StreamResult(fileOut);
            transformer.setOutputProperty("indent", "yes");
            transformer.transform(source, result);
            fileOut.close();
            
        } catch (TransformerConfigurationException tcEx) {
            System.out.println(tcEx.toString());
        } catch (TransformerException tEx) {
            System.out.println(tEx.toString());
        } catch (FileNotFoundException notEx) {
            System.out.println("File cannot be created: " + notEx.toString());
        } catch (SecurityException secEx) {
            System.out.println("No write access to file: " + secEx.toString());
        } catch (IOException ioEx) {
            System.out.println("I/O problem: " + ioEx.toString());
        } 
    }

    private static void printUsage() {
       
        System.out.println("Usage:");
        System.out.println("net.transformatorhuis.cgi.utils.ConfigGenerator [ouput] [basedir]\n");
        System.out.println("ouput: name and location of the config file to be created");
        System.out.println("basedir: start point for recursive search of classes");
   
    }
    
}