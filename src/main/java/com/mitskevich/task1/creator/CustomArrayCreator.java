package com.mitskevich.task1.creator;

import com.mitskevich.task1.entity.CustomArray;

import java.util.List;

public interface CustomArrayCreator {
    CustomArray createCustomArray();

    CustomArray createCustomArray(int... array);

    List<CustomArray> createCustomArray(List<int[]> arrays);
}
