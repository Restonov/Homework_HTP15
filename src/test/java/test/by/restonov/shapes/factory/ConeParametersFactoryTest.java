package test.by.restonov.shapes.factory;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.ShapeParameters;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.factory.impl.ConeParametersFactory;
import by.restonov.shapes.entity.impl.ConeParameters;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConeParametersFactoryTest extends Assert {
    ConeParametersFactory factory;
    ConeParameters parameters;
    Cone testCone;

    @BeforeTest
    public void setUp() {
        factory = new ConeParametersFactory();
        parameters = new ConeParameters(37.69911184307752, 75.39822368615503);

        testCone = new Cone("Cone0", 0);
        testCone.setBaseCenter(new Point(5.0, 2.0));
        testCone.setVertex(new Point(5.0, 6.0));
        testCone.setRadius(3.0);
    }

    @AfterTest
    public void tierDown() {
        factory = null;
        parameters = null;
        testCone = null;
    }

    @Test
    public void createParametersTest() {
        ConeParameters expected = parameters;
        ShapeParameters actual = factory.createParameters(testCone);
        AssertJUnit.assertEquals(expected, actual);
    }
}
