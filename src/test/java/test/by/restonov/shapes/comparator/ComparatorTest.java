package test.by.restonov.shapes.comparator;

import by.restonov.shapes.comparator.ConeComparator;
import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.repository.ConeRepository;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ComparatorTest extends Assert {
    Cone cone1;
    Cone cone2;
    List<Cone> sortedCones;
    ConeRepository repository;

    @BeforeTest
    public void setUp() {
        repository = ConeRepository.getInstance();

        cone1 = new Cone();
        cone2 = new Cone();
        sortedCones = new ArrayList<>();

        cone1.setId(23);
        cone1.setBaseCenter(new Point(5.0, 2.0));
        cone2.setId(523);
        cone2.setBaseCenter(new Point(6.0, 5.0));

        sortedCones.add(cone1);
        sortedCones.add(cone2);
        repository.add(cone2);
        repository.add(cone1);

    }

    @AfterTest
    public void tierDown() {
        cone1 = null;
        cone2 = null;
        sortedCones = null;
        repository = null;
    }

    @Test
    public void idComparatorTest() {
        List<Cone> expected = sortedCones;
        List<Cone> actual = repository.sort(ConeComparator.ID);
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void XCoordComparatorTest() {
        List<Cone> expected = sortedCones;
        List<Cone> actual = repository.sort(ConeComparator.FIRST_COORDINATE_X_POINT);
        AssertJUnit.assertEquals(expected, actual);
    }
}
