package com.mitskevich.task1.validator;

import com.mitskevich.task1.exceptions.CustomCommonException;

public interface CustomValidatorService {
    boolean isFirstValidLine(String text) throws CustomCommonException;
}
