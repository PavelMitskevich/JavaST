package com.mitskevich.task1.validator;

import com.mitskevich.task1.exception.CustomCommonException;

public interface CustomValidatorService {
    boolean isValidLine(String text) throws CustomCommonException;
}
