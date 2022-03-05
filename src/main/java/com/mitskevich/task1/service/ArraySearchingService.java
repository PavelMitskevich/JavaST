package com.mitskevich.task1.service;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.exception.CustomCommonException;

import java.util.OptionalInt;

public interface ArraySearchingService {
    OptionalInt searchingMinimal(CustomArray customArray) throws CustomCommonException;

    OptionalInt searchingMaximum(CustomArray customArray) throws CustomCommonException;
}
