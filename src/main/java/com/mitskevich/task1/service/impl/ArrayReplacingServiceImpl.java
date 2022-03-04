package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exceptions.CustomCommonException;
import com.mitskevich.task1.service.ArrayReplacingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ArrayReplacingServiceImpl implements ArrayReplacingService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int[] replaceElement(CustomArray customArray, int element, int newElement) throws CustomCommonException {
        if (customArray == null || customArray.getArray().length == 0) {
            LOGGER.error("This array is empty or null");
            throw new CustomCommonException("This array is empty or null");
        }
        if (element > customArray.getArray().length) {
            LOGGER.error("Element is out of bound array");
            throw new CustomCommonException("Element is out of bound array");
        }
        int[] array = customArray.getArray();
        array[element] = newElement;
        customArray.setArray(array);
        return customArray.getArray();
    }
}
