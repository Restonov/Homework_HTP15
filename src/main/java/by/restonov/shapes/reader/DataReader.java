package by.restonov.shapes.reader;

import by.restonov.shapes.exception.DataReaderException;
import by.restonov.shapes.validator.DataValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    static Logger logger = LogManager.getLogger();

    public List<String> readData(String filePath) throws DataReaderException{
        List<String> data;
        DataValidator validator = new DataValidator();
        BufferedReader bufferedReader;

        try {
            bufferedReader =  Files.newBufferedReader(Paths.get(filePath));
            data = bufferedReader.lines().filter(validator::validateInputData).collect(Collectors.toList());
            bufferedReader.close();
        } catch (IOException e) {
            logger.log(Level.ERROR, "File reading error", e);
            throw new DataReaderException("File reading error: " + filePath, e);
        }
        return data;
    }
}

