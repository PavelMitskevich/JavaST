package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exceptions.CustomCommonException;
import com.mitskevich.task1.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortServiceImpl implements ArraySortService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int[] bubbleSort(CustomArray customArray) throws CustomCommonException {
        if (customArray == null || customArray.getArray().length == 0) {
            LOGGER.error("This array is empty or null");
            throw new CustomCommonException("This array is empty or null");
        }
        for (int i = 0; i < customArray.getArray().length - 1; i++) {
            for (int j = i + 1; j < customArray.getArray().length; j++) {
                if (customArray.getArray()[i] > customArray.getArray()[j]) {
                    int temp = customArray.getArray()[i];
                    customArray.getArray()[i] = customArray.getArray()[j];
                    customArray.getArray()[j] = temp;
                }
            }
        }
        return customArray.getArray();
    }

    @Override
    public int[] insertionSort(CustomArray customArray) throws CustomCommonException {
        if (customArray == null || customArray.getArray().length == 0) {
            LOGGER.error("This array is empty or null");
            throw new CustomCommonException("This array is empty or null");
        }
        for (int i = 1; i < customArray.getArray().length; i++) {
            int value = customArray.getArray()[i];
            int j = i - 1;
            while (j >= 0 && value < customArray.getArray()[j]) {
                customArray.getArray()[j + 1] = customArray.getArray()[j];
                j--;
            }
            customArray.getArray()[j + 1] = value;
        }
        return customArray.getArray();
    }

    @Override
    public int[] selectionSort(CustomArray customArray) throws CustomCommonException {
        if (customArray == null || customArray.getArray().length == 0) {
            LOGGER.error("This array is empty or null");
            throw new CustomCommonException("This array is empty or null");
        }
        for (int i = 0; i < customArray.getArray().length; i++) {
            int min = customArray.getArray()[i];
            int minId = i;
            for (int j = i + 1; j < customArray.getArray().length; j++) {
                if (customArray.getArray()[j] < min) {
                    min = customArray.getArray()[j];
                    minId = j;
                }
            }
            int temp = customArray.getArray()[i];
            customArray.getArray()[i] = min;
            customArray.getArray()[minId] = temp;
        }
        return customArray.getArray();
    }
}
