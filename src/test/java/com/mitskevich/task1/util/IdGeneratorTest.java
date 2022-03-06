package com.mitskevich.task1.util;

import com.mitskevich.task1.entity.CustomArray;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdGeneratorTest {
    CustomArray customArray1 = new CustomArray();
    CustomArray customArray2 = new CustomArray();
    CustomArray customArray3 = new CustomArray();

    @Test
    public void testGenerateId() {
        int expected = 3;
        int actual = customArray3.getArrayId();
        assertEquals(expected, actual);
    }
}