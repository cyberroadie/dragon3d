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
public class Handle {

    Attributestack as;

    public Handle(ObjectFactory objFactory) {
	this.as = objFactory.createAttributestack();
	List asList = as.getTranslateOrRotateOrScale();

	Translate translate = objFactory.createTranslate();
	translate.setDx(-4.3);
	translate.setDy(4.2);
	translate.setDz(0);
	asList.add(translate);

	Transformstack transformstack1 = objFactory.createTransformstack();
	List ts1List = transformstack1.getRotateOrTranslateOrDisk();

	Rotate rotate1 = objFactory.createRotate();
	rotate1.setAngle(180);
	rotate1.setDx(0);
	rotate1.setDy(0);
	rotate1.setDz(1);
	ts1List.add(rotate1);

	Torus torus1 = objFactory.createTorus();
	torus1.setMajorradius(0.52);
	torus1.setMinorradius(0.26);
	torus1.setPhiminus(0);
	torus1.setPhimax(360);
	torus1.setThetamax(360);
	ts1List.add(torus1);

	asList.add(transformstack1);

	Transformstack transformstack2 = objFactory.createTransformstack();
	List ts2List = transformstack2.getRotateOrTranslateOrDisk();

	Translate translate2 = objFactory.createTranslate();
	translate2.setDx(-2.38);
	translate2.setDy(0);
	translate2.setDz(0);
	ts2List.add(translate2);

	Rotate rotate2 = objFactory.createRotate();
	rotate2.setAngle(90);
	rotate2.setDx(0);
	rotate2.setDy(0);
	rotate2.setDz(1);
	ts2List.add(rotate2);

	Torus torus2 = objFactory.createTorus();
	torus2.setMajorradius(0.52);
	torus2.setMinorradius(0.26);
	torus2.setPhiminus(0);
	torus2.setPhimax(360);
	torus2.setThetamax(90);
	ts2List.add(torus2);

	asList.add(transformstack2);

	Translate translate3 = objFactory.createTranslate();
	translate3.setDx(-2.38);
	translate3.setDy(0.52);
	translate3.setDz(0);
	asList.add(translate3);

	Rotate rotate3 = objFactory.createRotate();
	rotate3.setAngle(90);
	rotate3.setDx(0);
	rotate3.setDy(1);
	rotate3.setDz(0);
	asList.add(rotate3);

	Cylinder cylinder = objFactory.createCylinder();
	cylinder.setRadius(0.26);
	cylinder.setZmin(0);
	cylinder.setZmax(3.3);
	cylinder.setThetamax(360);
	asList.add(cylinder);

    }

    public Attributestack getJAXB() {
	return as;
    }

}
