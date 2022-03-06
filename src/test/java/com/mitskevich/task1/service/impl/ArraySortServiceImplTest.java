package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.service.ArraySortService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySortServiceImplTest {
    ArraySortService sortService = new ArraySortServiceImpl();

    @DataProvider(name = "dataSort")
    public Object[][] dataSort() {
        return new Object[][]{{new CustomArray(1, 3, 5, 7), new CustomArray(1, 3, 5, 7)},
                {new CustomArray(-6, 12, 2, 8), new CustomArray(-6, 2, 8, 12)},
                {new CustomArray(1, -1, 25, 5), new CustomArray(1, -1, 25, 0)},
                {new CustomArray(3, 1), new CustomArray(1, 3)}};
    }

    @Test(dataProvider = "dataSort")
    public void testBubbleSort(CustomArray array, CustomArray expected) throws CustomCommonException {
        CustomArray actual = new CustomArray(sortService.bubbleSort(array));
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataSort")
    public void testInsertionSort(CustomArray array, CustomArray expected) throws CustomCommonException {
        CustomArray actual = new CustomArray(sortService.insertionSort(array));
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataSort")
    public void testSelectionSort(CustomArray array, CustomArray expected) throws CustomCommonException {
        CustomArray actual = new CustomArray(sortService.selectionSort(array));
        assertEquals(actual, expected);
    }
}