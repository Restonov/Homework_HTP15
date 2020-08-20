package test.by.restonov.shapes.creator;

import by.restonov.shapes.creator.ConeListCreator;
import by.restonov.shapes.entity.Cone;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConeListCreatorTest extends Assert {
    List<Cone> testCone = new ArrayList<>();

    @BeforeTest
    public void setUpArray() {
        testCone.add(new Cone("Cone1", 1));
    }

    @Test
    public void coneListCreatorTest() {
        ConeListCreator creator = new ConeListCreator();
        List<Cone> expected = testCone;
        List<Cone> actual = creator.createConeList("resources/data/conesDataTest.txt");
        AssertJUnit.assertEquals(expected, actual);
    }

}
