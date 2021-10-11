package by.epam.task01.service;

import by.epam.task01.entity.CustomArray;
import by.epam.task01.exception.CustomArrayException;

public interface CustomArrayService {

    int findMax(CustomArray array);

    int findMin(CustomArray array);

    int sumOfElements(CustomArray array) throws CustomArrayException;

    int positiveElements(CustomArray array);

    int negativeElements(CustomArray array);




}
