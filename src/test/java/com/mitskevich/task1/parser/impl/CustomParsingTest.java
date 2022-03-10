package com.mitskevich.task1.parser.impl;

import com.mitskevich.task1.parser.CustomParsingService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CustomParsingTest {
    CustomParsingService parsingService = new CustomParsing();

    public List<String> textList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("1, 3, 5, 7");
        stringList.add("-6 12 2 8");
        stringList.add("  ");
        stringList.add("3; 1");
        return stringList;
    }

    public List<int[]> intsList() {
        List<int[]> ints = new ArrayList<>();
        ints.add(new int[]{1, 3, 5, 7});
        ints.add(new int[]{-6, 12, 2, 8});
        ints.add(new int[]{});
        ints.add(new int[]{3, 1});
        return ints;
    }

    @DataProvider(name = "dataParsing")
    public Object[][] dataParsing() {
        return new Object[][]{{"1, 3, 5, 7", new int[]{1, 3, 5, 7}},
                {"-6 12 2 8", new int[]{-6, 12, 2, 8}},
                {"  ", new int[]{}},
                {"3; 1", new int[]{3, 1}}};
    }

    @DataProvider(name = "dataParsingText")
    public Object[][] dataParsingText() {
        return new Object[][]{{textList(), intsList()}};
    }

    @Test(dataProvider = "dataParsing")
    public void testParseLineToArray(String strings, int[] expected) {
        int[] actual = parsingService.parseLineToArray(strings);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataParsingText")
    public void testParseTextToArray(List<String> stringList, List<int[]> expected) {
        List<int[]> actual = parsingService.parseTextToArray(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            assertEquals(actual.get(i), expected.get(i));
        }
    }
}