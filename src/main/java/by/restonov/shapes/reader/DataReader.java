package by.restonov.shapes.reader;

import by.restonov.shapes.exception.DataReaderException;
import by.restonov.shapes.validator.DataValidator;
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

    public List<String> readData(String dataPath) throws DataReaderException{
        List<String> data;
        DataValidator validator = new DataValidator();
        BufferedReader bufferedReader;

        try {
            bufferedReader =  Files.newBufferedReader(Paths.get(dataPath));
            data = bufferedReader.lines().filter(validator::validateInputData).collect(Collectors.toList());
            bufferedReader.close();
        } catch (IOException e) {
            logger.error("File reading error", e);
            throw new DataReaderException("File reading error: " + dataPath, e);
        }
        return data;
    }
}

