package com.mitskevich.task1.service.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.service.ArrayReplacingService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayReplacingServiceImplTest {
    ArrayReplacingService replacingService = new ArrayReplacingServiceImpl();

    @DataProvider(name = "dataForReplacing")
    public Object[][] dataForReplacing() {
        Object[][] objects = new Object[5][1];
        objects[0] = new Object[]{new CustomArray(1, 3, 5, 7), 2, 4, new CustomArray(1, 3, 4, 7)};
        objects[1] = new Object[]{new CustomArray(-6, 12, 2, 8), 0, -64, new CustomArray(-64, 12, 2, 8)};
        objects[2] = new Object[]{new CustomArray(1, -1, 25, 5), 3, 0, new CustomArray(1, -1, 25, 0)};
        objects[3] = new Object[]{new CustomArray(1035, 153, 56, 7, 12), 1, 1, new CustomArray(1035, 1, 56, 7, 12)};
        objects[4] = new Object[]{new CustomArray(1, 3), 0, -1, new CustomArray(1, 3)};
        return objects;
    }

    @Test(dataProvider = "dataForReplacing")
    public void testReplaceElement(CustomArray actual, int element, int newElement, CustomArray expected) throws CustomCommonException {
        replacingService.replaceElement(actual, element, newElement);
        assertEquals(actual, expected);
    }
}