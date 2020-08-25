package by.restonov.shapes.parser;

public class DataParser {
    private static final String REGEX_DELIMITER = " ";
    private static final int INPUT_DATA_AMOUNT = 5;

    public double[] parseData (String dataString) {
        double[] parsed = new double[INPUT_DATA_AMOUNT];
        String[] splitted = dataString.split(REGEX_DELIMITER);
        for (int i = 0; i < splitted.length; i++) {
            double data = Double.parseDouble(splitted[i]);
            parsed[i] = data;
        }
        return parsed;
    }
}
