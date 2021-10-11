package by.epam.task01.reader;

import by.epam.task01.exception.CustomArrayException;

import java.util.List;

public interface CustomReaderFromFile {

    String readFromFile(String fileName) throws CustomArrayException;

}
