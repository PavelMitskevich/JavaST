package com.mitskevich.task1.observer.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.observer.CustomArrayEvent;
import com.mitskevich.task1.observer.Observer;
import com.mitskevich.task1.service.*;
import com.mitskevich.task1.service.impl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayObserver implements Observer {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void parameterChanged(CustomArrayEvent event) {
        CustomArray customArray = event.getSource();
        ArrayCalculateService calculateService = new ArrayCalculateServiceImpl();
        ArrayCounterService counterService = new ArrayCounterServiceImpl();
        ArraySearchingService searchingService = new ArraySearchingServiceImpl();

        try {
            OptionalDouble average = calculateService.averageOfArray(customArray);
            OptionalInt sum = calculateService.sumOfElements(customArray);
            int countPositive = counterService.countPositiveNumbers(customArray);
            int countNegative = counterService.countNegativeNumbers(customArray);
            OptionalInt min = searchingService.searchingMinimal(customArray);
            OptionalInt max = searchingService.searchingMaximum(customArray);
        } catch (CustomCommonException e) {
            e.printStackTrace();
        }

    }
}
