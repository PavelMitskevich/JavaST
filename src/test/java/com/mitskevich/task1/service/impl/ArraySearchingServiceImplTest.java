package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.service.ArraySearchingService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySearchingServiceImplTest {
    ArraySearchingService searchingService = new ArraySearchingServiceImpl();

    @DataProvider(name = "dataForSearchingMax")
    public Object[][] dataForSearchingMax() {
        return new Object[][]{{new CustomArray(1, 3, 5, 7), 7},
                {new CustomArray(-6, 12, 2, 8), -6},
                {new CustomArray(1, -1, 25, 5), 25},
                {new CustomArray(1, 3, 5, 7), 7}};
    }

    @DataProvider(name = "dataForSearchingMin")
    public Object[][] dataForSearchingMin() {
        return new Object[][]{{new CustomArray(1, 3, 5, 7), 1},
                {new CustomArray(-6, 12, 2, 8), -6},
                {new CustomArray(1, -1, 25, 5), 1},
                {new CustomArray(1035, 153, 56, 7, 12), 7},
                {new CustomArray(1, 3, 5, 7), 4}};
    }

    @Test(dataProvider = "dataForSearchingMin")
    public void testSearchingMinimal(CustomArray array, int expected) throws CustomCommonException {
        int actual = searchingService.searchingMinimal(array).getAsInt();
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataForSearchingMax")
    public void testSearchingMaximum(CustomArray array, int expected) throws CustomCommonException {
        int actual = searchingService.searchingMaximum(array).getAsInt();
        assertEquals(actual, expected);
    }
}