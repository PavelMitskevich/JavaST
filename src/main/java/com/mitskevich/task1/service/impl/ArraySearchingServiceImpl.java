package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.service.ArraySearchingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalInt;

public class ArraySearchingServiceImpl implements ArraySearchingService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public OptionalInt searchingMinimal(CustomArray customArray) throws CustomCommonException {
        if (customArray == null || customArray.getArray().length == 0) {
            LOGGER.error("This array is empty or null, can't find min");
            throw new CustomCommonException("This array is empty or null, can't find min");
        }
        int min = customArray.getArray()[0];
        for (int i = 0; i < customArray.getArray().length; i++) {
            if (min > customArray.getArray()[i]) {
                min = customArray.getArray()[i];
            }
        }
        return OptionalInt.of(min);
    }

    @Override
    public OptionalInt searchingMaximum(CustomArray customArray) throws CustomCommonException {
        if (customArray == null || customArray.getArray().length == 0) {
            LOGGER.error("This array is empty or null, can't find max");
            throw new CustomCommonException("This array is empty or null, can't find max");
        }
        int max = customArray.getArray()[0];
        for (int i = 0; i < customArray.getArray().length; i++) {
            if (max < customArray.getArray()[i]) {
                max = customArray.getArray()[i];
            }
        }
        return OptionalInt.of(max);
    }
}
