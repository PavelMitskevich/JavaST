package com.mitskevich.task1.comparator;

import com.mitskevich.task1.entity.CustomArray;

import java.util.Comparator;

public class IdComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return Integer.compare(o1.getArrayId(), o2.getArrayId());
    }
}
