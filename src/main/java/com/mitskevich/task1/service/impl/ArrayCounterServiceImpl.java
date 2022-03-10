package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.service.ArrayCounterService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCounterServiceImpl implements ArrayCounterService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int countPositiveNumbers(CustomArray customArray) throws CustomCommonException {
        if (customArray == null || customArray.getArray().length == 0) {
            LOGGER.error("This array is empty or null");
            throw new CustomCommonException("This array is empty or null");
        }
        int count = 0;
        for (int i = 0; i < customArray.getArray().length; i++) {
            if (customArray.getArray()[i] > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countNegativeNumbers(CustomArray customArray) throws CustomCommonException {
        if (customArray == null || customArray.getArray().length == 0) {
            LOGGER.error("This array is empty or null");
            throw new CustomCommonException("This array is empty or null");
        }
        int count = 0;
        for (int i = 0; i < customArray.getArray().length; i++) {
            if (customArray.getArray()[i] < 0) {
                count++;
            }
        }
        return count;
    }
}
