package com.mitskevich.task1.repository.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.repository.Specification;
import com.mitskevich.task1.service.ArraySearchingService;
import com.mitskevich.task1.service.impl.ArraySearchingServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalInt;

public class MinLessValueSpecification implements Specification {
    private static final Logger LOGGER = LogManager.getLogger();
    int value;

    public MinLessValueSpecification(int value) {
        this.value = value;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = false;
        ArraySearchingService searchingService = new ArraySearchingServiceImpl();
        try {
            OptionalInt minOptional = searchingService.searchingMinimal(customArray);
            int min = minOptional.getAsInt();
            result = min < value;
        } catch (CustomCommonException e) {
            LOGGER.error("No such arrays", e);
        }
        return result;
    }
}
