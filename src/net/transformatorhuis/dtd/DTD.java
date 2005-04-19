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
package net.transformatorhuis.dtd;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;

/**
 * @author mgs
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DTD {
	
	static Logger logger = Logger.getLogger(DTD.class);
	
	private CharBuffer cbuf;
	
	public DTD(File file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			FileChannel fc = fis.getChannel();
			ByteBuffer bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, (int)fc.size());
			this.cbuf = Charset.forName("8859_1").newDecoder().decode(bbuf);
			
		} catch (Exception e) {
			logger.error(e.toString());
		}
		
		
		
	}


}
