package com.mitskevich.task1.service;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;

public interface ArrayCounterService {
    int countPositiveNumbers(CustomArray customArray) throws CustomCommonException;

    int countNegativeNumbers(CustomArray customArray) throws CustomCommonException;
}
