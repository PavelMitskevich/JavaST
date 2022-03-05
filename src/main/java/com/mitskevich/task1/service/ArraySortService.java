package com.mitskevich.task1.service;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;

public interface ArraySortService {
    int[] bubbleSort(CustomArray customArray) throws CustomCommonException;

    int[] insertionSort(CustomArray customArray)throws CustomCommonException;

    int[] selectionSort(CustomArray customArray) throws  CustomCommonException;
}
