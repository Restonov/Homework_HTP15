package test.by.restonov.shapes.action;

import by.restonov.shapes.action.Calculation;
import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.entity.impl.TruncatedCone;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculationTest extends Assert {
    Calculation calculations;
    Cone cone;
    TruncatedCone truncatedCone;

    @BeforeTest
    public void setUp() {
        calculations = new Calculation();
        cone = new Cone();
        truncatedCone = new TruncatedCone();

        cone.setBaseCenter(new Point(5.0, 2.0));
        cone.setVertex(new Point(5.0, 6.0));
        cone.setRadius(3.0);
        cone.setHeight(4.0);

        truncatedCone.setUpperRadius(5.0);
        truncatedCone.setBottomRadius(7.0);
        truncatedCone.setHeight(5.0);
        truncatedCone.setBottomBaseCenter(new Point(5.0, 3.0));
        truncatedCone.setUpperBaseCenter(new Point(5.0, 8.0));
    }

    @AfterTest
    public void tierDown() {
        calculations = null;
        cone = null;
        truncatedCone = null;
    }

    @Test
    public void calculateSquareTest() {
        double expected = 75.39822368615503;
        double actual = calculations.square(cone);
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void calculateVolumeTest() {
        double expected = 37.69911184307752;
        double actual = calculations.volume(cone);
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void calculateHeightTest() {
        double expected = cone.getHeight();
        double actual = calculations.height(cone);
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void calculateTruncatedConeVolumeTest() {
        double expected = 570.7226654021458;
        double actual = calculations.volume(truncatedCone);
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void calculateTruncatedConeHeightTest() {
        double expected = truncatedCone.getHeight();
        double actual = calculations.height(truncatedCone);
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void volumesRatioTest() {
        double expected = 0.9212827988338192;
        double actual = calculations.volumesRatio(cone, truncatedCone);
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void findIsBaseCenterOnXAxisTestFalse() {
        boolean actual = calculations.findIsBaseCenterOnXAxis(cone);
        AssertJUnit.assertFalse(actual);
    }

    @Test
    public void findIsBaseCenterOnXAxisTestTrue() {
        cone.setBaseCenter(new Point(5.0, 0.0));
        boolean actual = calculations.findIsBaseCenterOnXAxis(cone);
        AssertJUnit.assertTrue(actual);
    }
}
