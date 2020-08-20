package by.restonov.shapes.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    Logger logger = LogManager.getLogger();
    int counter = 0;
    Pattern sourcePattern = Pattern.compile("^(?!\\-)(\\d+\\.{1}\\d+\\ ){4}(\\d+\\.{1}\\d+){1}$");
    public boolean validate(String data) {
        boolean validationResult = false;
        Matcher matcher = sourcePattern.matcher(data);
            if (matcher.matches()) {
                validationResult = true;
                counter++;
                logger.log(Level.INFO, "Валидацию прошли " + counter + " строки данных");
            } return validationResult;
    }
}
