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
package net.transformatorhuis.cgi.conversion;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.xml.DOMConfigurator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Holds all information about status rib xml document
 * together with the document itself. 
 * Implements Singleton pattern.
 */
public class RibDocument {

    static Logger logger = Logger.getLogger(RibDocument.class);

    private static boolean instance_flag = false;
    
    private static RibDocument instance;
    
    /* Vector to keep track of current active xml element */
    private Vector parentElements;

    /**
     * All classes make use of the same (thus static) document 
     * Rib2Xml starts with empty document which get filled via 
     * the RibFactory. 
     */
    private static Document ribDoc;

    private RibDocument() {
    
        /* Create empty xml document */
        DocumentBuilderFactory docBuilderFac = DocumentBuilderFactory.newInstance();
        
        try {
            DocumentBuilder docBuilder = docBuilderFac.newDocumentBuilder();
            ribDoc = docBuilder.newDocument();
        } catch (ParserConfigurationException ex) { } // No exception, empty document is created
    
        Element root = ribDoc.createElement("rib");
       
        parentElements = new Vector();
        
    };

    public static RibDocument getRibDocument() {
    
        if(!instance_flag) {
            instance_flag = true;
            instance = new RibDocument();
        } 
        
        return instance;
       
    }

    
    public void finalize() {
        instance_flag = false;
    }

}