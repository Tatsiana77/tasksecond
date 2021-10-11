package by.epam.task01.creator.impl;

import by.epam.task01.creator.CustomArrayCreator;
import by.epam.task01.entity.CustomArray;

public class CustomArrayCreatorImpl implements CustomArrayCreator {
    @Override
    public CustomArray create(int ... arr) {
        CustomArray customArray = new CustomArray();
        return customArray;

    }
}
