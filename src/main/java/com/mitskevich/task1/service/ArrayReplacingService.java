package com.mitskevich.task1.service;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;

public interface ArrayReplacingService {
    int[] replaceElement(CustomArray customArray, int element, int newElement) throws CustomCommonException;
}
