package com.mitskevich.task1.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int... array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : array) {
            stringBuilder.append(a).append(" ");
        }
        return stringBuilder.toString();
    }
}
