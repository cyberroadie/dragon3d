/**
 * 
 */
package net.transformatorhuis.teapot;

import net.transformatorhuis.xsd.Attributestack;
import net.transformatorhuis.xsd.ObjectFactory;

/**
 * @author cyberroadie
 *
 */
public class Top {

	Attributestack as;
	
	public Top(ObjectFactory objFactory) {
		this.as = objFactory.createAttributestack();
	}
	
	public Attributestack getJAXB() {
		return as;
	}
}
