package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.service.ArrayCounterService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayCounterServiceImplTest {
    ArrayCounterService counterService = new ArrayCounterServiceImpl();

    @DataProvider(name = "dataPositive")
    public Object[][] dataPositiveNumbers() {
        return new Object[][]{{new CustomArray(new int[]{1, 3, 5, 7}), 4},
                {new CustomArray(new int[]{-6, 12, -2, 8}), 2},
                {new CustomArray(new int[]{1, -1, 25, 5}), 3},
                {new CustomArray(new int[]{-1035, 153, 56, 7, 12}), 4},
                {new CustomArray(new int[]{1, -3}), 1},
                {new CustomArray(new int[]{5, 0, 12}), 2},
                {new CustomArray(new int[]{1, -3, 5, 7}), 1}};
    }

    @DataProvider(name = "dataNegative")
    public Object[][] dataNegativeNumbers() {
        return new Object[][]{{new CustomArray(new int[]{-1, -3, -5, -7}), 4},
                {new CustomArray(new int[]{-6, 12, 2, 8}), 1},
                {new CustomArray(new int[]{1, -1, 25, 5}), 1},
                {new CustomArray(new int[]{1035, -1153, 56, 7, 12}), 1},
                {new CustomArray(new int[]{1, 3}), 0},
                {new CustomArray(new int[]{5, 0, 12}), 0},
                {new CustomArray(new int[]{1, 13, -5, -7}), 4}};
    }

    @Test(dataProvider = "dataPositive")
    public void testCountPositiveNumbers(CustomArray array, int expected) throws CustomCommonException {
        int actual = counterService.countPositiveNumbers(array);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataNegative")
    public void testCountNegativeNumbers(CustomArray array, int expected) throws CustomCommonException {
        int actual = counterService.countNegativeNumbers(array);
        assertEquals(actual, expected);
    }
}