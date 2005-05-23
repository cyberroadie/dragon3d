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
package net.transformatorhuis.cgi.utils;

import java.net.URL;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * @author mgs
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DTD2Source {

	static Logger logger = Logger.getLogger(DTD2Source.class);
	
	public DTD2Source() {
		
        /* Configure log4j, read conf out of jar file */
        Class clazz = getClass();
        URL url = clazz.getResource("/conf/log4j.xml");
        DOMConfigurator.configure(url);
		
	}
	
	public static void main(String[] args) {
		
	}
}
