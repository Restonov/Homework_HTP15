package test.by.restonov.shapes.creator;

import by.restonov.shapes.creator.ConeListCreator;
import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConeListCreatorTest extends Assert {
    List<Cone> testConeArray = new ArrayList<>();

    @BeforeTest
    public void setUpCone() {
        Cone testCone = new Cone("Cone0", 0);
        testCone.setBaseCenter(new Point(5.0, 2.0));
        testCone.setVertex(new Point(5.0, 6.0));
        testCone.setRadius(3.0);
        testConeArray.add(testCone);
    }

    @Test
    public void coneListCreatorTest() {
        ConeListCreator creator = new ConeListCreator();
        List<Cone> expected = testConeArray;
        List<Cone> actual = creator.createConeList("resources/data/conesDataTest.txt");
        AssertJUnit.assertEquals(expected, actual);
    }

}
