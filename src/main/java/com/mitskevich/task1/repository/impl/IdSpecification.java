package com.mitskevich.task1.repository.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.repository.Specification;

public class IdSpecification implements Specification {
    private int value;

    public IdSpecification(int value) {
        this.value = value;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        return customArray.getArrayId() == value;
    }
}
