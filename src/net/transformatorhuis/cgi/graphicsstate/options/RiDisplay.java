package net.transformatorhuis.cgi.graphicsstate.options;

import java.util.Enumeration;
import java.util.Vector;
import java.io.StringReader;
import java.io.StreamTokenizer;
import org.w3c.dom.*;
import org.apache.xerces.dom.*;

/**
 * Parse a "Display" line from a rib file
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

class RiDisplay extends RiElement {

	private String thName;
	private String thType;
	private String thMode;
	private Vector thParam;

	public RiDisplay(String thName, String thType, String thMode, Vector thParam) {
	
		this.thName = thName;
		this.thType = thType;
		this.thMode = thMode;
		this.thParam = thParam;
		
	}


	public RiDisplay(String thName, String thType, String thMode) {
	
		new RiDisplay(thName, thType, thMode, null);
		
	}


	public RiDisplay(Enumeration thLines) {
	
		while(thLines.hasMoreElements()) {
			
			parseLine((String) thLines.nextElement());
		
		}
		
	}
	
	//
	// Should be in upper class ???
	//
	public Vector parseLine(String thLine) {

            /*
            StreamTokenizer thTok = new StringReader(thLine);
		
		String thElement = (String) thTok.nextElement();
	

             if(thElement.equals("Display")) {
			
		} else if (thElement.equals("Declare")) {
		
		}
		*/
            return new Vector();
            
        }

	
	private void addParam(String thName, String thValue) {
		thParam.add(new ThParam(thName, thValue));
	}
	

	public Element getElement(Element thParent) {
		thParent.appendChild(createElement());
		return thParent;
	}
	
	public Element createElement() {

            
            Document thDoc = new DocumentImpl();
		Element thDisplay = thDoc.createElement("display");
		thDisplay.setAttribute("name", thName);
		thDisplay.setAttribute("type", thType);
		thDisplay.setAttribute("mode", thMode);
                Enumeration thParamEnum = thParam.elements();
                
                while(thParamEnum.hasMoreElements()) {
			ThParam thParamElement = (ThParam) thParamEnum.nextElement();
			Element thParamElem = thDoc.createElement("param");
			thParamElem.setAttribute("name", thParamElement.getName());
			//thParamElem.appendChild(thDoc.createTextNode(thParamElement.getValue()));
			//thDisplay.appendChild(thParam);
		}
		
		return thDisplay;
	
	}


}