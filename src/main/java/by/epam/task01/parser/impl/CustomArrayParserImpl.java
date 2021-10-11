package by.epam.task01.parser.impl;

import by.epam.task01.exception.CustomArrayException;
import by.epam.task01.parser.CustomArrayParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayParserImpl implements CustomArrayParser {

    static Logger logger = LogManager.getLogger();
    private static final String  SPLIT_REGEX = ";";

    @Override
    public int[] parseStringToArray(String line) throws CustomArrayException {

        if (line.isEmpty()) {
            logger.error("Not found correct data to parse.");
            throw new CustomArrayException("Not found correct data to parse.");
        }

        String[] strArr = line.split(SPLIT_REGEX);
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        return intArr;
    }
}
