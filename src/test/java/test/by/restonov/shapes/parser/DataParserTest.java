package test.by.restonov.shapes.parser;

import by.restonov.shapes.parser.DataParser;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class DataParserTest extends Assert {

    @Test
    public void parseDataTest() {
        DataParser parser = new DataParser();
        double[] expected = {5.0, 2.0, 5.0, 6.0, 3.0};
        double[] actual = parser.parseData("5.0 2.0 5.0 6.0 3.0");
        AssertJUnit.assertArrayEquals(expected, actual, 0.00001);
    }
}
