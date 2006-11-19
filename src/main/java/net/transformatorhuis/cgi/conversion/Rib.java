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

import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Vector;

/**
 * @author Olivier VAn Acker
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class Rib {

	static Logger logger = Logger.getLogger(Rib.class);

	// This pattern is not perfect. 
	private Pattern p = Pattern.compile("\"[\\w\\s.]*\"|\\[[\\p{Graph}\\p{Blank}]*\\]|[\\d\\p{Punct}]*'");
	
    private String param = null;
    
    public Rib() {
        this(null);
    }
    
    public Rib(String param) {
        this.param = param;
        
    }
    
    /**
     * Return name of element based on class name 
     * without starting with 'Ri' and ending with 'Begin'
     * and in lower case.
     * @return name of the element in lowercase
     */
    protected String getElementName() {
    
        String className = this.getClass().getName();
        String elementName = className.substring(className.lastIndexOf(".Ri") + 3, className.length());
        if(hasChildElements()) {
            elementName = elementName.substring(0, elementName.indexOf("Begin"));
        }
        logger.debug("Element name: " + elementName);
        return elementName.toLowerCase();
    
    }
    
    /**
     * Creates xml node.
     * Most straight forward implementation, 
     * this class is usually overwritten by sub class
     * @param ribDoc - DOM xml document to add the xml to
     * @return xml piece for this element
     */
    public Node createXML(RibDocument ribDoc) {
    
        Element ribRoot = ribDoc.requestElement(getElementName());
        if(param != null) {
            ribRoot.appendChild(ribDoc.requestTextNode(param));
        }
        
        return ribRoot;
            
    }

    public boolean hasChildElements() {
        return false;
    }
    
    public boolean isEndElement() {
        return false;
    }
    
    /**
     * Split up parameters and put them in a Vector
     * @param parameters - line with all parameters
     * @return vector with all parameters seperate
     */
    public Vector splitParameters(String parameters) {
    	Vector parameterList = new Vector();
    	Matcher m = p.matcher(parameters);
    	
    	while(m.find()) {
    		if(m.start() != m.end()) {
    			String match = m.group();
    			logger.debug("Parameter: " + match);
    			// Remove quotes
    			if(match.startsWith("\"") && match.endsWith("\"")) {
    				match = match.substring(1, match.length() - 1);
    			} 
    			parameterList.add(match);
    		}
    	}
    	
        return parameterList;
    }
    
    public void setParameters(Vector parameterList, int start) {
    	
    }
}
