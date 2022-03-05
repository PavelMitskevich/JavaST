package com.mitskevich.task1.service;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ArrayCalculateService {
    OptionalDouble averageOfArray(CustomArray customArray) throws CustomCommonException;

    OptionalInt sumOfElements(CustomArray customArray) throws CustomCommonException;
}
