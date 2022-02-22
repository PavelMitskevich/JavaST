package com.mitskevich.task1.utils;

import com.mitskevich.task1.entity.CustomArray;

public class CustomParsing implements CustomParsingService{
    CustomArray customArray = new CustomArray();

    @Override
    public int[] parseToArray(String text) {

        String[] strings = text.split("\\s+");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        customArray.setArray(ints);
        return customArray.getArray();
    }
}
