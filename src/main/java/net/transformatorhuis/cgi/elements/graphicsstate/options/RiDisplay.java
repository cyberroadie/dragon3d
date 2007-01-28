package net.transformatorhuis.cgi.elements.graphicsstate.options;

import org.apache.log4j.Logger;

import org.w3c.dom.Element;

import net.transformatorhuis.cgi.conversion.Rib;
import net.transformatorhuis.cgi.conversion.RibDocument;

import java.util.Vector;

import org.w3c.dom.Node;

/**
 * @author cyberroadie
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