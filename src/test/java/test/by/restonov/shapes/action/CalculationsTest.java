package test.by.restonov.shapes.action;

import by.restonov.shapes.action.Calculations;
import by.restonov.shapes.entity.Point;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CalculationsTest extends Assert {
    Calculations calculations = new Calculations();

    @Test
    public void findSquareTest() {
        double expected = 46.402359007287274;
        double actual = calculations.findSquare(5.0, 2.0);
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void findVolumeTest() {
        double expected = 75.39822368615503;
        double actual = calculations.findVolume(8.0, 3.0);
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void findHeightTest() {
        double expected = 6.0;
        double actual = calculations.findHeight(new Point(5.0, 8.0), new Point(5.0, 2.0));
        AssertJUnit.assertEquals(expected, actual);
    }
}
