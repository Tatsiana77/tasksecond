package by.epam.task01.parser;

import by.epam.task01.exception.CustomArrayException;

public interface CustomArrayParser {
    int[] parseStringToArray(String line) throws CustomArrayException;
}
