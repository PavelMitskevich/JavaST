package com.mitskevich.task1.service;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exceptions.CustomCommonException;

public class CustomArrayServiceImpl implements CustomArrayService {

    @Override
    public int searchingMinimal(CustomArray customArray) {
        int min = customArray.getArray()[0];
        for (int i = 0; i < customArray.getArray().length; i++) {
            if (min > customArray.getArray()[i]) {
                min = customArray.getArray()[i];
            }
        }
        return min;
    }

    @Override
    public int searchingMaximum(CustomArray customArray) {
        int max = customArray.getArray()[0];
        for (int i = 0; i < customArray.getArray().length; i++) {
            if (max < customArray.getArray()[i]) {
                max = customArray.getArray()[i];
            }
        }
        return max;
    }

    @Override
    public int[] replaceElement(CustomArray customArray, int element, int newElement) {
        int[] array = customArray.getArray();
        array[element] = newElement;
        try {
            throw new CustomCommonException("Element out of bound");
        } catch (CustomCommonException e) {
            e.printStackTrace();
        }
        return array;
    }

    @Override
    public double averageOfArray(CustomArray customArray) {
        int sum = 0;
        int i = 0;
        for (; i < customArray.getArray().length; i++) {
            sum += customArray.getArray()[i];
        }
        return (double) sum / i;
    }

    @Override
    public int sumOfElements(CustomArray customArray) {
        int sum = 0;
        for (int i = 0; i < customArray.getArray().length; i++) {
            sum += customArray.getArray()[i];
        }
        return sum;
    }

    @Override
    public int countPositiveNumbers(CustomArray customArray) {
        int count = 0;
        for (int i = 0; i < customArray.getArray().length; i++) {
            if (customArray.getArray()[i] > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countNegativeNumbers(CustomArray customArray) {
        int count = 0;
        for (int i = 0; i < customArray.getArray().length; i++) {
            if (customArray.getArray()[i] < 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int[] bubbleSort(CustomArray customArray) {
        int temp;
        for (int i = 0; i < customArray.getArray().length - 1; i++) {
            for (int j = i + 1; j < customArray.getArray().length; j++) {
                if (customArray.getArray()[i] > customArray.getArray()[j]) {
                    temp = customArray.getArray()[i];
                    customArray.getArray()[i] = customArray.getArray()[j];
                    customArray.getArray()[j] = temp;
                }
            }
        }
        return customArray.getArray();
    }
}
