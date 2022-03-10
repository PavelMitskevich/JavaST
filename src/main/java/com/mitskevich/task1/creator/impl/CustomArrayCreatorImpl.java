package com.mitskevich.task1.creator.impl;

import com.mitskevich.task1.creator.CustomArrayCreator;
import com.mitskevich.task1.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayCreatorImpl implements CustomArrayCreator {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public CustomArray createCustomArray() {
        LOGGER.info("Creating array");
        return new CustomArray();
    }

    @Override
    public CustomArray createCustomArray(int... array) {
        LOGGER.info("Creating array");
        return array != null ? new CustomArray(array) : new CustomArray();
    }

    @Override
    public List<CustomArray> createCustomArray(List<int[]> arrays) {
        LOGGER.info("Creating array");
        List<CustomArray> customArrayList = new ArrayList<>();
        if (arrays == null) {
            return customArrayList;
        }
        for (int[] array : arrays) {
            customArrayList.add(new CustomArray(array));
        }
        return customArrayList;
    }
}
