package com.mitskevich.task1.service;

import com.mitskevich.task1.entity.CustomArray;

public interface CustomArrayService {
    int searchingMinimal(CustomArray customArray);

    int searchingMaximum(CustomArray customArray);

    int[] replaceElement(CustomArray customArray, int element, int newElement);

    double averageOfArray(CustomArray customArray);

    int sumOfElements(CustomArray customArray);

    int countPositiveNumbers(CustomArray customArray);

    int countNegativeNumbers(CustomArray customArray);

    int[] bubbleSort(CustomArray customArray);
}
