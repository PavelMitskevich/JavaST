package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.service.ArraySearchingService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySearchingServiceImplTest {
    ArraySearchingService searchingService = new ArraySearchingServiceImpl();

    @DataProvider(name = "dataForSearching")
    public Object[][] dataForSearching() {
        return new Object[][]{{new CustomArray(1, 3, 5, 7), 4},
                {new CustomArray(-6, 12, 2, 8), 4},
                {new CustomArray(1, -1, 25, 5), 7.5},
                {new CustomArray(1035, 153, 56, 7, 12), 252.6},
                {new CustomArray(1, 3), 2},
                {new CustomArray(5, 0, 12), 9},
                {new CustomArray(1, 3, 5, 7), 4}};
    }

    @Test
    public void testSearchingMinimal() {
    }

    @Test
    public void testSearchingMaximum() {
    }
}