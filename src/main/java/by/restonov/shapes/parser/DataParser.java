package by.restonov.shapes.parser;

public class DataParser {

    public double[] parseData (String dataString) {
        double[] parsed = new double[5];
        String[] splitted = dataString.split(" ");

        for (int i = 0; i < splitted.length; i++) {
            double data = Double.parseDouble(splitted[i]);
            parsed[i] = data;
        }
        return parsed;
    }
}
