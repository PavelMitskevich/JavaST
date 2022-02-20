package com.mitskevich.task1.service;

import com.mitskevich.task1.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CustomArrayServiceImplTest {
    private final CustomArrayServiceImpl customArrayService = new CustomArrayServiceImpl();
    private final CustomArray customArray = new CustomArray();

    @org.testng.annotations.Test
    public void testSearchingMinimal() {
        Assert.assertEquals(-7, customArrayService.searchingMinimal(customArray));
    }

    @Test
    public void testSearchingMaximum() {
        Assert.assertEquals(6,customArrayService.searchingMaximum(customArray));
    }

    @AfterTest
    public void testReplaceElement() {
        Assert.assertEquals(Arrays.toString(new int[]{-7, 8, 0, 3, 6}), Arrays.toString(customArrayService.replaceElement(customArray, 1, 8)));
    }

    @Test
    public void testSumOfElements() {
        Assert.assertEquals(-3,customArrayService.sumOfElements(customArray));
    }

    @Test
    public void testCountPositiveNumbers() {
        Assert.assertEquals(2,customArrayService.countPositiveNumbers(customArray));
    }

    @Test
    public void testCountNegativeNumbers() {
        Assert.assertEquals(2,customArrayService.countNegativeNumbers(customArray));
    }

    @Test
    public void testBubbleSort() {
        Assert.assertEquals(Arrays.toString(new int[]{-7, -5, 0, 3, 6}), Arrays.toString(customArrayService.bubbleSort(customArray)));
    }
}