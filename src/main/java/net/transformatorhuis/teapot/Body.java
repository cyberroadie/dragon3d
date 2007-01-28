package net.transformatorhuis.teapot;

import java.util.List;

import net.transformatorhuis.xsd.Attributestack;
import net.transformatorhuis.xsd.ObjectFactory;
import net.transformatorhuis.xsd.Rotate;
import net.transformatorhuis.xsd.Scale;
import net.transformatorhuis.xsd.Sphere;
import net.transformatorhuis.xsd.Transformstack;
import net.transformatorhuis.xsd.Translate;

//import net.transformatorhuis.xsd.*;

/**
 * @author cyberroadie
 *
 */
public class Body {

    /**
     * Attribute stack.
     */
    private Attributestack as;

    /**
     * @param objFactory object factory
     */
    public Body(final ObjectFactory objFactory) {
        this.as = objFactory.createAttributestack();
        List asList = as.getTranslateOrRotateOrScale();

        Rotate rotate = objFactory.createRotate();
        rotate.setAngle(-90);
        rotate.setDx(1);
        rotate.setDy(0);
        rotate.setDz(0);
        asList.add(rotate);

        Transformstack transformstack1 = objFactory.createTransformstack();
        List ts1List = transformstack1.getRotateOrTranslateOrDisk();

        Translate translate1 = objFactory.createTranslate();
        translate1.setDx(0);
        translate1.setDy(0);
        translate1.setDz(1.7);
        ts1List.add(translate1);

        Scale scale1 = objFactory.createScale();
        scale1.setSx(1);
        scale1.setSy(1);
        scale1.setSz(1.05468457);
        ts1List.add(scale1);

        Sphere sphere1 = objFactory.createSphere();
        sphere1.setRadius(5);
        sphere1.setZmin(0);
        sphere1.setZmax(3.12897569);
        sphere1.setThetamax(360);
        ts1List.add(sphere1);

        asList.add(transformstack1);

        Transformstack transformstack2 = objFactory.createTransformstack();
        List ts2List = transformstack2.getRotateOrTranslateOrDisk();

        Translate translate2 = objFactory.createTranslate();
        translate2.setDx(0);
        translate2.setDy(0);
        translate2.setDz(1.7);
        ts1List.add(translate2);

        Scale scale2 = objFactory.createScale();
        scale2.setSx(1);
        scale2.setSy(1);
        scale2.setSz(0.463713017);
        ts2List.add(scale2);

        Sphere sphere2 = objFactory.createSphere();
        sphere2.setRadius(5);
        sphere2.setZmin(-3.66606055);
        sphere2.setZmax(0);
        sphere2.setThetamax(360);
        ts2List.add(sphere2);

        asList.add(transformstack2);

    }

    /**
     * @return attribute stack
     */
    public final Attributestack getJAXB() {
        return as;
    }
}
