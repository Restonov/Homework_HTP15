package test.by.restonov.shapes.factory;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.factory.impl.ConeParametersFactory;
import by.restonov.shapes.warehouse.impl.ConeParameters;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConeParametersFactoryTest extends Assert {
    Cone testCone;

    @BeforeTest
    public void setUpCone() {
        testCone = new Cone("Cone0", 0);
        testCone.setBaseCenter(new Point(5.0, 2.0));
        testCone.setVertex(new Point(5.0, 6.0));
        testCone.setRadius(3.0);
    }

    @Test
    public void createParametersTest() {
        ConeParametersFactory parameters = new ConeParametersFactory();
        ConeParameters expected = parameters.createParameters(testCone);
        ConeParameters actual = parameters.createParameters(testCone);
        AssertJUnit.assertEquals(expected, actual);
    }
}
