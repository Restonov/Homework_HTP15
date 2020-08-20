package by.restonov.shapes.reader;

import by.restonov.shapes.validator.DataValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    List<String> data = new ArrayList<>();
    DataValidator validator = new DataValidator();

    public List<String> readData(String filePath) throws IOException {
        BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(filePath));
        data = bufferedReader.lines().filter(lines -> validator.validate(lines)).collect(Collectors.toList());
        bufferedReader.close();
        return data;
    }
}

