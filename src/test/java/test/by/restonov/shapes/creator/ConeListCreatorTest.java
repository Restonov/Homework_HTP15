package test.by.restonov.shapes.creator;

import by.restonov.shapes.creator.ConeListCreator;
import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConeListCreatorTest extends Assert {
    Cone testCone;
    List<Cone> testConeArray;
    ConeListCreator creator;
    List<double[]> expectedParsedData;

    @BeforeTest
    public void setUp() {
        testCone = new Cone("Cone0", 0);
        testCone.setBaseCenter(new Point(5.0, 2.0));
        testCone.setVertex(new Point(5.0, 6.0));
        testCone.setRadius(3.0);

        testConeArray = new ArrayList<>();
        testConeArray.add(testCone);

        creator = new ConeListCreator();
        expectedParsedData = new ArrayList<>();
        expectedParsedData.add(new double[]{5.0, 2.0, 5.0, 6.0, 3.0});
    }

    @AfterTest
    public void tierDown() {
        testCone = null;
        testConeArray = null;
        creator = null;
    }

    @Test
    public void coneListCreatorTest() {
        List<Cone> expected = testConeArray;
        List<Cone> actual = creator.createConeList(expectedParsedData);
        AssertJUnit.assertEquals(expected, actual);
    }

}
