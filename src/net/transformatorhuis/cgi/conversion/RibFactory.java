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
import org.apache.log4j.BasicConfigurator;

import net.transformatorhuis.cgi.elements.*;
import net.transformatorhuis.cgi.types.*;

import java.lang.reflect.*;

public class RibFactory {

	static Logger logger = Logger.getLogger(RibFactory.class);

    public Rib getRibElement(String ribLine) {
    
        String element = null;
        String param;
        Class ribElement;
        Class[] intArgsClass;
        Object[] intArgs;
        Class ribElementDefinition;
        Rib rib = null;
        
        int c = ribLine.indexOf(' ');
        if(c != -1) {
            // With params
            param = ribLine.substring(c, ribLine.length()); // Get rid of the EOL ('\r')
            element = ribLine.substring(0, c);
            intArgsClass = new Class[] {String.class, String.class}; 
            intArgs = new Object[] {element, param};

        } else {
            // No params
            element = ribLine; //.substring(0, ribLine.length()); // Get rid of the EOL ('\r')
            intArgsClass = new Class[] {String.class}; 
            intArgs = new Object[] {element};
        }
             
        try {   
            ribElementDefinition = Class.forName("net.transformatorhuis.cgi.elements.Ri" + element, true, this.getClass().getClassLoader());
            
            //Constructor con = ribElementDefinition.getConstructor(intArgsClass);
            //rib = (Rib) con.newInstance(intArgs);
            rib = (Rib) ribElementDefinition.getConstructor(intArgsClass).newInstance(intArgs);
        } catch (InstantiationException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (InvocationTargetException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        } 
        
        return rib; 
        
    }
    
}
