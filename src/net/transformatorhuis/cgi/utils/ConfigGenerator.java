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
 * stored in the jar file.
 * If class files are added or removed the config file stays correct.
 */
public class ConfigGenerator {

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
         
        for(int i = 0; i < dir.length; i++) {
            if(dir[i].isDirectory()) {
                //System.out.println(dir[i].getPath());
                createDirContent(dir[i].listFiles(), dir[i].getPath());
            } else {
                //System.out.println(dir[i].getName());
                add(key, dir[i].getName());
            }
        }
        
    }
    
    /**
     * Adds key to dirContent hashtable and the key
     * is linked to a vector (which can store multiple keys).
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
     */
    private void createConfigDoc(File configFile) {
    
        Element root = configDoc.createElement("ribelements");
        
        for(Enumeration keys = dirContent.keys(); keys.hasMoreElements();) {
        
            String key = (String) keys.nextElement();
            Element ribPackage = configDoc.createElement("package");
            ribPackage.setAttribute("name", key);
            Vector valueVec = (Vector) dirContent.get(key);
            for(Enumeration values = valueVec.elements(); values.hasMoreElements();) {
                String value = (String) values.nextElement();
                Element ribFile = configDoc.createElement("ribelement");
                ribFile.setAttribute("name", value);
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