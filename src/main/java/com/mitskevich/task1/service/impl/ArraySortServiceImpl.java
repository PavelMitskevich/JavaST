package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArraySortServiceImpl implements ArraySortService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int[] bubbleSort(CustomArray customArray) throws CustomCommonException {
        int[] array = customArray.getArray();
        if (customArray == null || array.length == 0) {
            LOGGER.error("This array is empty or null");
            throw new CustomCommonException("This array is empty or null");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public int[] insertionSort(CustomArray customArray) throws CustomCommonException {
        int[] array = customArray.getArray();
        if (customArray == null || array.length == 0) {
            LOGGER.error("This array is empty or null");
            throw new CustomCommonException("This array is empty or null");
        }
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            while (j >= 0 && value < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = value;
        }
        return array;
    }

    @Override
    public int[] selectionSort(CustomArray customArray) throws CustomCommonException {
        int[] array = customArray.getArray();
        if (customArray == null || array.length == 0) {
            LOGGER.error("This array is empty or null");
            throw new CustomCommonException("This array is empty or null");
        }
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }
}
