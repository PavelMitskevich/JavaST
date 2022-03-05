package com.mitskevich.task1.repository.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.repository.Specification;
import com.mitskevich.task1.service.ArrayCalculateService;
import com.mitskevich.task1.service.impl.ArrayCalculateServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;

public class AverageBetweenTwoValuesSpecification implements Specification {
    private static final Logger LOGGER = LogManager.getLogger();
    private double minValue;
    private double maxValue;

    public AverageBetweenTwoValuesSpecification(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        ArrayCalculateService calculateService = new ArrayCalculateServiceImpl();
        boolean result = false;
        try {
            OptionalDouble averageOptional = calculateService.averageOfArray(customArray);
            double average = averageOptional.getAsDouble();
            result = (average > minValue && average < maxValue);
        } catch (CustomCommonException e) {
            LOGGER.error("Average is empty", e);
            e.printStackTrace();
        }
        return result;
    }
}
