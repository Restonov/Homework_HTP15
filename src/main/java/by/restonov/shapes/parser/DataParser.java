package by.restonov.shapes.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DataParser {
    private static final String DATA_DELIMITER = " ";

    public List<double[]> parseData(List<String> dataList) {
        List<double[]> parsedData = new ArrayList<>();

        for (String data : dataList) {
            String[] splittedData = data.split(DATA_DELIMITER);

            double[] parsedDataPart;
            parsedDataPart = Stream.of(splittedData).mapToDouble(Double::parseDouble).toArray();
            parsedData.add(parsedDataPart);
        }
        return parsedData;
    }
}
