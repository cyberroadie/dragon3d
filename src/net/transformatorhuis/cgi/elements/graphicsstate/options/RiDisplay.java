/* 
   +----------------------------------------------------------------------+
   | Dragon3D                                                             |
   +----------------------------------------------------------------------+
   | Copyright (c) 2004-2005 Cyberroadie                                  |
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
   | Author: Olivier Van Acker <cyberroadie@gmail.com>                    |
   +----------------------------------------------------------------------+
*/
package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;

import org.w3c.dom.Element;

import net.transformatorhuis.cgi.conversion.Rib;
import net.transformatorhuis.cgi.conversion.RibDocument;

import java.util.Vector;

import org.w3c.dom.Node;

/**
 *
 */
public class RiDisplay extends Rib {

	static Logger logger = Logger.getLogger(RiDisplay.class);
	 
	private String name;
	private String type;
	private String mode;

	private Vector parameterList;
	
    public RiDisplay(String parameters) {
    	super(parameters);
    	parameterList = splitParameters(parameters);
    	
        setName((String) parameterList.get(0));
        setType((String) parameterList.get(1));
        setMode((String) parameterList.get(2));
        if(parameterList.size() > 3) {
        	setParameters(parameterList, 3);
        } else {
        	setParameters(null, 0);
        }
    }
    
    /**
     * Sets the name of picture file or framebuffer depending on type
     * @param name  picture file or framebuffer name
     */
    public void setName(String name) {
    	this.name = name;
    }
    
    /**
     * Sets the display format, output device or output driver.
     * @param type display type
     */
    public void setType(String type) {
    	this.type = type;
    }
    
    /**
     * Sets the mode which indicates what data are to be output in this display stream
     * @param mode data mode
     */
    public void setMode(String mode) {
    	this.mode = mode;
    }
    
    /**
     * Returns the name of the picture file or framebuffer
     * @return the name
     */
    public String getName() {
    	return name;
    }
    
    /**
     * Returns the display format, output device or output driver.
     * @return the type
     */
    public String getType() {
    	return type;
    }
    
    /**
     * Returns the mode which indicates what data are to be output in this display stream
     * @return the data mode
     */
    public String getMode() {
    	return mode;
    }
    
    /**
     * Creates the XML fragment for RiDisplay rib element.
     * <p>
     * DTD fragment
     * <pre>
     * &lt;!ELEMENT DISPLAY - O EMPTY -- RiDisplay --&gt;
     * &lt;!ATTLIST DISPLAY 
     *   name    CDATA   #REQUIRED -- name of the picture file or framebuffer --
     *   type    CDATA   #REQUIRED -- the display format, output device or output driver --
     *   mode    CDATA   #REQUIRED -- the mode which indicates what data are to be output in this display stream --
     * &gt;
     * </pre>
     * <p>
	 * <h1>Example</h1>
	 * Input:
	 * <pre>
	 * Display "swordMesh.tif" "file" "rgba"
	 * </pre>
	 * <p>
	 * Output with parameters:
	 * <pre>
	 * &lt;display name="swordMesh.tif" type="file" mode="rgba" &gt;
	 *	&lt;param name="[name]" value="[value]" /&gt;
	 * &lt;/display&gt;
	 * </pre>
	 * <p>
	 * Output without parameters:
	 * <pre>
	 * &lt;display name="swordMesh.tif" type="file" mode="rgba" /&gt;
	 * </pre>
	 * 
     * @param ribDoc - DOM XML document to request an element from
     * @return Display xml node
     */
    public Node createXML(RibDocument ribDoc) {
    
        Element ribRoot = ribDoc.requestElement(getElementName());
        ribRoot.setAttribute("name", getName());
        ribRoot.setAttribute("type", getType());
        ribRoot.setAttribute("mode", getMode());
        
        return (Node) ribRoot;
        
    } 

}