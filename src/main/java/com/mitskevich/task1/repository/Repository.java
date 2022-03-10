package com.mitskevich.task1.repository;

import com.mitskevich.task1.entity.CustomArray;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {
    private List<CustomArray> customArrayList;

    public int size() {
        return customArrayList.size();
    }

    public boolean add(CustomArray customArray) {
        return customArrayList.add(customArray);
    }

    public boolean remove(Object o) {
        return customArrayList.remove(o);
    }

    public CustomArray get(int index) {
        return customArrayList.get(index);
    }

    public CustomArray set(int index, CustomArray element) {
        return customArrayList.set(index, element);
    }

    public void add(int index, CustomArray element) {
        customArrayList.add(index, element);
    }

    public CustomArray remove(int index) {
        return customArrayList.remove(index);
    }

    public List<CustomArray> query(Specification specification) {
        return customArrayList.stream()
                .filter(specification::specify)
                .collect(Collectors.toList());
    }

    public List<CustomArray> sort(Comparator<? super CustomArray> comparator) {
        return customArrayList.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
