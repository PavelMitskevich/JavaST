package com.mitskevich.task1.repository.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.repository.Specification;
import com.mitskevich.task1.service.ArrayCalculateService;
import com.mitskevich.task1.service.impl.ArrayCalculateServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalInt;

public class SumBetweenTwoValuesSpecification implements Specification {
    private static final Logger LOGGER = LogManager.getLogger();
    private int minValue;
    private int maxValue;

    public SumBetweenTwoValuesSpecification(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = false;
        ArrayCalculateService calculateService = new ArrayCalculateServiceImpl();
        try {
            OptionalInt sumOptional = calculateService.sumOfElements(customArray);
            int sum = sumOptional.getAsInt();
            result = (sum > minValue && sum < maxValue);
        } catch (CustomCommonException e) {
            LOGGER.error("Sum is empty",e);
        }
        return result;
    }
}
