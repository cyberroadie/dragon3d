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

public class RiDisplay extends Rib {

    public RiDisplay(String element) {
        super(element);
    }

    public RiDisplay(String element, String param) {
        super(element, param);
    }

}