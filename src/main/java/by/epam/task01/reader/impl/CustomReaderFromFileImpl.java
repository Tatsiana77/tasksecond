package by.epam.task01.reader.impl;

import by.epam.task01.exception.CustomArrayException;
import by.epam.task01.reader.CustomReaderFromFile;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class CustomReaderFromFileImpl implements CustomReaderFromFile {

    static Logger logger = LogManager.getLogger();
    private static final String EMPTY_STRING_REGEX = "\s";

    @Override
    public String readFromFile(String path) throws CustomArrayException {

        StringBuilder builder = new StringBuilder();

        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                builder.append(line + EMPTY_STRING_REGEX);
            }
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "File" + path + " was not found", e);
            throw new CustomArrayException("File was not found", e);
        }
        return builder.toString();
    }
}
