package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.service.ArrayCalculateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public OptionalDouble averageOfArray(CustomArray customArray) throws CustomCommonException {
        if (customArray == null) {
            LOGGER.error("This array is null, can't find average");
            throw new CustomCommonException("This array is null, can't find average");
        }
        if (customArray.getArray().length == 0) {
            LOGGER.error("This array is empty, can't find average");
            return OptionalDouble.empty();
        }
        int sum = 0;
        int i = 0;
        for (; i < customArray.getArray().length; i++) {
            sum += customArray.getArray()[i];
        }
        return OptionalDouble.of((double) sum / i);
    }

    @Override
    public OptionalInt sumOfElements(CustomArray customArray) throws CustomCommonException {
        if (customArray == null ) {
            LOGGER.error("This array is null, can't find sum");
            throw new CustomCommonException("This array is null, can't find sum");
        }
        if (customArray.getArray().length == 0) {
            LOGGER.error("This array is empty, can't find sum");
            return OptionalInt.empty();
        }
        int sum = 0;
        for (int i = 0; i < customArray.getArray().length; i++) {
            sum += customArray.getArray()[i];
        }
        return OptionalInt.of(sum);
    }
}
