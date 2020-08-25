package by.restonov.shapes.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    private static final Pattern checkingDecimalNumber = Pattern.compile("^(?!\\-)(\\d+\\.{1}\\d+\\ ){4}(\\d+\\.{1}\\d+){1}$");

    public boolean validateInputData(String data) {
        boolean result = false;
        Matcher matcher = checkingDecimalNumber.matcher(data);
            if (matcher.matches()) {
                result = true;
            } return result;
    }
}
