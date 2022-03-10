package com.mitskevich.task1.validator.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;
import com.mitskevich.task1.validator.CustomValidatorService;
import lombok.SneakyThrows;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomValidatorTest {
    CustomValidatorService validatorService = new CustomValidator();

    @DataProvider(name = "dataLines")
    public Object[][] dataLines() {
        Object[][] lines = new String[5][1];
        lines[0] = new String[]{"1, 3, 5, 7" };
        lines[1] = new String[]{"" };
        lines[2] = new String[]{"1, -3 1" };
        lines[3] = new String[]{"5, 0, 12w, 2" };
        lines[4] = new String[]{"1xz -3a, 5, 7}), 1" };
        return lines;
    }

    @Test(dataProvider = "dataLines")
    public void testIsValidLine(String line) throws CustomCommonException {
        assertTrue(validatorService.isValidLine(line));
    }
}