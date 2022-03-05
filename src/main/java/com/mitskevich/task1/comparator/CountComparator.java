package com.mitskevich.task1.comparator;

import com.mitskevich.task1.entity.CustomArray;

import java.util.Arrays;
import java.util.Comparator;

public class CountComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        int o1Count = Math.toIntExact(Arrays.stream(o1.getArray()).count());
        int o2Count = Math.toIntExact(Arrays.stream(o2.getArray()).count());
        return Integer.compare(o1Count, o2Count);
    }
}
