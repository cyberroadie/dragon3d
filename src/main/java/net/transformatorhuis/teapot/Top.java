/**
 * 
 */
package net.transformatorhuis.teapot;

import java.util.List;

import net.transformatorhuis.xsd.*;

/**
 * @author cyberroadie
 *
 */
public class Top {

	Attributestack as;
	
	public Top(ObjectFactory objFactory) {
		this.as = objFactory.createAttributestack();
		List asList = as.getTranslateOrRotateOrScale();
		
		Rotate rotate = objFactory.createRotate();
		rotate.setAngle(-90);
		rotate.setDx(1);
		rotate.setDy(0);
		rotate.setDz(0);
		asList.add(rotate);
		
		Translate translate1 = objFactory.createTranslate();
		translate1.setDx(0);
		translate1.setDy(0);
		translate1.setDz(5);
		asList.add(translate1);
		
		Attributestack as2 = objFactory.createAttributestack();
		List as2List = as2.getTranslateOrRotateOrScale();
		Scale scale = objFactory.createScale();
		scale.setSx(1);
		scale.setSy(1);
		scale.setSz(0.2051282);
		as2List.add(scale);
		
		Sphere sphere = objFactory.createSphere();
		sphere.setRadius(3.9);
		sphere.setZmin(0);
		sphere.setZmax(3.9);
		sphere.setThetamax(360);
		as2List.add(sphere);
		
		asList.add(as2);
		
		Translate translate2 = objFactory.createTranslate();
		translate2.setDx(0);
		translate2.setDy(0);
		translate2.setDz(0.8);
		asList.add(translate2);
		
		Attributestack as3 = objFactory.createAttributestack();
		List as3List = as3.getTranslateOrRotateOrScale();
		
		Orientation orientation = objFactory.createOrientation();
		orientation.setOrientation("rh");
		as3List.add(orientation);
		
		Sides sides = objFactory.createSides();
		sides.setSides("2"); // TODO not type safe, change xml schema
		as3List.add(sides);
		
		Torus torus1 = objFactory.createTorus();
		torus1.setMajorradius(0.75);
		torus1.setMinorradius(0.45);
		torus1.setPhiminus(-90);
		torus1.setPhimax(90);
		torus1.setThetamax(360);
		as3List.add(torus1);
		
		asList.add(as3);
		
		Translate translate3 = objFactory.createTranslate();
		translate3.setDx(0);
		translate3.setDy(0);
		translate3.setDz(0.675);
		asList.add(translate3);
		
		Torus torus2 = objFactory.createTorus();
		torus2.setMajorradius(0.75);
		torus2.setMinorradius(0.225);
		torus2.setPhiminus(-90);
		torus2.setPhimax(90);
		torus2.setThetamax(360);
		asList.add(torus2);
		
		Disk disk = objFactory.createDisk();
		disk.setHeight(0.225);
		disk.setRadius(0.75);
		disk.setThetamax(360);
		asList.add(disk);
		
	}
	
	public Attributestack getJAXB() {
		return as;
	}
}
