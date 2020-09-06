package test.by.restonov.shapes.reader;

import by.restonov.shapes.exception.DataReaderException;
import by.restonov.shapes.reader.DataReader;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest extends Assert {
    List<String> testArray;
    DataReader dataReader;

    @BeforeTest
    public void setUp() {
        testArray = new ArrayList<>();
        testArray.add("5.0 2.0 5.0 6.0 3.0");

        dataReader = new DataReader();
    }

    @AfterTest
    public void tierDown() {
        testArray = null;
        dataReader = null;
    }

    @Test
    public void readDataTestTrue() {
        List<String> expected = testArray;
        List<String> actual = null;
        try {
            actual = dataReader.readData("src/main/resources/data/conesDataTest.txt");
        } catch (DataReaderException e) {
            e.printStackTrace();
        }
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void readDataTestFalse() {
        List<String> actual = null;
        try {
            actual = dataReader.readData("rsources/data/conesDataTest.txt");
        } catch (DataReaderException e) {
            e.printStackTrace();
        }
        AssertJUnit.assertNull(actual);
    }
}
