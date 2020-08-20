package test.by.restonov.shapes.validator;

import by.restonov.shapes.validator.DataValidator;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class DataValidatorTest extends Assert {

    @Test
    public void validateTestTrue() {
        DataValidator dataValidator = new DataValidator();
        boolean expected = true;
        boolean actual = dataValidator.validate("5.0 2.0 5.0 6.0 3.0");
        AssertJUnit.assertEquals(expected, actual);
    }

    @Test
    public void validateTestFalse() {
        DataValidator dataValidator = new DataValidator();
        boolean expected = false;
        boolean actual = dataValidator.validate("5.0 2.0 5.0 6.0 -3.0");
        AssertJUnit.assertEquals(expected, actual);
    }
}
