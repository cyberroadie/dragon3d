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
package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.w3c.dom.Element;

/**
 * Parse a "Display" element from a rib file
 * Example:
 * Display "swordMesh.tif" "file" "rgba"
 *
 * Output with parameters:
 * <display name="swordMesh.tif" type="file" mode="rgba" >
 *	<param name"[name]">
 *		[value]
 * 	</param>
 * </display>
 *
 * Output without parameters:
 * <display name="swordMesh.tif" type="file" mode="rgba" />
 */

import net.transformatorhuis.cgi.conversion.Rib;

import net.transformatorhuis.cgi.conversion.RibDocument;

import org.w3c.dom.Node;

public class RiDisplay extends Rib {

	static Logger logger = Logger.getLogger(RiDisplay.class);
	 

    public RiDisplay() {
        super();
    }

    public RiDisplay(String param) {
        super(param);
    }
    
    public Node createXML(RibDocument ribDoc) {
    
        String[] params = getParams();
        Element ribRoot = ribDoc.requestElement(getElementName());
        ribRoot.setAttribute("name", params[0].substring(1, params[0].length() - 1));
        ribRoot.setAttribute("type", params[1].substring(1, params[1].length() - 1));
        ribRoot.setAttribute("mode", params[2].substring(1, params[2].length() - 1));
        
        return (Node) ribRoot;
        
    } 

}