package net.transformatorhuis.teapot;

import java.util.List;

import net.transformatorhuis.xsd.Attributestack;
import net.transformatorhuis.xsd.Hyperboloid;
import net.transformatorhuis.xsd.Rotate;
import net.transformatorhuis.xsd.Sides;
import net.transformatorhuis.xsd.Translate;
import net.transformatorhuis.xsd.ObjectFactory;

/**
 * @author cyberroadie
 * 
 */
public class Spout {

    /**
     * Attribute stack.
     */
    private Attributestack as;

    /**
     * @param objFactory object factory
     */
    public Spout(ObjectFactory objFactory) {
        this.as = objFactory.createAttributestack();
        List asList = as.getTranslateOrRotateOrScale();

        Sides sides = objFactory.createSides();
//      // TODO can this be a integer? This is not type
        sides.setSides("2");
        // safe
        asList.add(sides);

        Translate translate = objFactory.createTranslate();
        translate.setDx(3);
        translate.setDy(1.3);
        translate.setDz(0);
        asList.add(translate);

        Rotate rotate = objFactory.createRotate();
        rotate.setAngle(30);
        rotate.setDx(0);
        rotate.setDy(0);
        rotate.setDz(1);
        asList.add(rotate);

        Rotate rotate2 = objFactory.createRotate();
        rotate2.setAngle(90);
        rotate2.setDx(0);
        rotate2.setDy(1);
        rotate2.setDz(0);
        asList.add(rotate2);

        Hyperboloid hyperboloid = objFactory.createHyperboloid();
        hyperboloid.setThetamax(360);
        hyperboloid.setX1(1.2);
        hyperboloid.setY1(0);
        hyperboloid.setZ1(0);
        hyperboloid.setX2(0.4);
        hyperboloid.setY2(0);
        hyperboloid.setZ2(5.7);
        asList.add(hyperboloid);

    }

    /**
     * Get JAXB objects.
     * @return attribute stack
     */
    public Attributestack getJAXB() {
        return as;
    }
}
