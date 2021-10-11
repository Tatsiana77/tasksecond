package by.epam.task01.main;

import by.epam.task01.creator.CustomArrayCreator;
import by.epam.task01.creator.impl.CustomArrayCreatorImpl;
import by.epam.task01.entity.CustomArray;
import by.epam.task01.exception.CustomArrayException;
import by.epam.task01.parser.CustomArrayParser;
import by.epam.task01.parser.impl.CustomArrayParserImpl;
import by.epam.task01.reader.CustomReaderFromFile;
import by.epam.task01.reader.impl.CustomReaderFromFileImpl;
import by.epam.task01.service.CustomArrayService;
import by.epam.task01.service.impl.CustomArrayServiceImpl;

public class Main {
    public static void main(String[] args) {
        CustomArrayService service = new CustomArrayServiceImpl();
        CustomReaderFromFile reader = new CustomReaderFromFileImpl();
        CustomArrayCreator creator = new CustomArrayCreatorImpl();
        CustomArrayParser parser = new CustomArrayParserImpl();

        try {
            String text = reader.readFromFile("data/array.txt");
            int[] array = parser.parseStringToArray(text);
            CustomArray arr = creator.create(array);

            int value;
//            value = service.findAverage(arr);
            value = service.findMax(arr);
            value = service.findMin(arr);
            value = service.negativeElements(arr);
            value = service.positiveElements(arr);
            value = service.sumOfElements(arr);

        } catch (CustomArrayException e) {
            e.printStackTrace();
        }
    }
}
