package com.mitskevich.task1.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array = new int[]{0, 3, -5, 6, -7};

    public CustomArray() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
