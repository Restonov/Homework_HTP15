package test.by.restonov.shapes.sorter;

import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.sorter.ConeListSorter;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.util.List;

public class ConeListSorterTest {

    @Test
    public void sortTest() {
        ConeListSorter sorter = new ConeListSorter();
        List<Cone> expected = null;
        List<String> actual = null;
        AssertJUnit.assertEquals(expected, actual);
    }
}
