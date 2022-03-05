package com.mitskevich.task1.parser.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.parser.CustomParsingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomParsing implements CustomParsingService {
    private static final Logger LOGGER = LogManager.getLogger();
    CustomArray customArray = new CustomArray();

    @Override
    public int[] parseLineToArray(String line) {
        String[] strings = line.split("(,\\s+)|(\\s+)|(;\\s+)");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        customArray.setArray(ints);
        LOGGER.info("Successful parsing" + Arrays.toString(customArray.getArray()));
        return customArray.getArray();
    }

    @Override
    public List<int[]> parseTextToArray(List<String> text) {
        List<int[]> integers = new ArrayList<>();
        for (String line : text) {
            integers.add(parseLineToArray(line));
        }
        return integers;
    }
}
