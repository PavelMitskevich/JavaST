package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.service.ArrayCalculateService;
import lombok.SneakyThrows;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.OptionalDouble;
import java.util.OptionalInt;

import static org.testng.Assert.*;

public class ArrayCalculateServiceImplTest {
    ArrayCalculateService calculateService = new ArrayCalculateServiceImpl();

    @DataProvider(name = "dataAverage")
    public Object[][] dataAverageOfArray() {
        return new Object[][]{{new CustomArray(new int[]{1, 3, 5, 7}), 4},
                {new CustomArray(new int[]{-6, 12, 2, 8}), 4},
                {new CustomArray(new int[]{1, -1, 25, 5}), 7.5},
                {new CustomArray(new int[]{1035, 153, 56, 7, 12}), 252.6},
                {new CustomArray(new int[]{1, 3}), 2},
                {new CustomArray(new int[]{5, 0, 12}), 9},
                {new CustomArray(new int[]{1, 3, 5, 7}), 4}};
    }

    @DataProvider(name = "dataSum")
    public Object[][] dataSumOfArray() {
        return new Object[][]{{new CustomArray(new int[]{1, 3, 5, 7}), 15},
                {new CustomArray(new int[]{-6, 12, 2, 8}), 16},
                {new CustomArray(new int[]{1, -1, 25, 5}), 7},
                {new CustomArray(new int[]{1035, 153, 56, 7, 12}), 1263},
                {new CustomArray(new int[]{1, 3}), 5},
                {new CustomArray(new int[]{5, 0, 12}), 17},
                {new CustomArray(new int[]{1, 3, 5, 7}), 16}};
    }

    @Test(dataProvider = "dataAverage")
    public void testAverageOfArray(CustomArray array, double expected) throws CustomCommonException {
        double actual = calculateService.averageOfArray(array).getAsDouble();
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataSum")
    public void testSumOfElements(CustomArray array, int expected) throws CustomCommonException {
        int actual = calculateService.sumOfElements(array).getAsInt();
        assertEquals(actual, expected);
    }
}