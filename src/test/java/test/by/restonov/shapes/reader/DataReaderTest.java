package test.by.restonov.shapes.reader;

import by.restonov.shapes.exception.DataReaderException;
import by.restonov.shapes.reader.DataReader;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest extends Assert {
    List<String> testArray = new ArrayList<>();

    @BeforeTest
    public void setUpTestArray (){
        testArray.add("5.0 2.0 5.0 6.0 3.0");
    }

    @Test
    public void readDataTestTrue() {
        DataReader dataReader = new DataReader();
        List<String> expected = testArray;
        List<String> actual = null;
        try {
            actual = dataReader.readData("resources/data/conesDataTest.txt");
        } catch (DataReaderException e) {
            e.printStackTrace();
        }
        AssertJUnit.assertEquals(expected, actual);
    }
}
