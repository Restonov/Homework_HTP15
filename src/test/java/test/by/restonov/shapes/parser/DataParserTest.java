package test.by.restonov.shapes.parser;

import by.restonov.shapes.parser.DataParser;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataParserTest extends Assert {
    private static final int FIRST_DATA_PART = 0;
    DataParser parser;
    List<String> data;
    List<double[]> parsedData;

    @BeforeTest
    public void setUp() {
        parser = new DataParser();
        data = new ArrayList<>();
        data.add("5.0 6.0");
        parsedData = parser.parseData(data);
    }

    @AfterTest
    public void tierDown() {
        parser = null;
        data = null;
        parsedData = null;
    }

    @Test
    public void parseDataTest() {
        double[] expected = {5.0, 6.0};
        double[] actual = parsedData.get(FIRST_DATA_PART);
        AssertJUnit.assertArrayEquals(expected, actual, 0.00001);
    }
}
