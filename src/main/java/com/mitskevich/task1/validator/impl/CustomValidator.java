package com.mitskevich.task1.validator.impl;

import com.mitskevich.task1.validator.CustomValidatorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class CustomValidator implements CustomValidatorService {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Pattern PATTERN = Pattern.compile("([-?\\d+\\s]+)|([-?\\d+,\\s]+)");

    @Override
    public boolean isValidLine(String text) {
        boolean flag = false;
        if (text.matches(PATTERN.pattern())) {
            LOGGER.info("Successful validation");
            flag = true;
        }
        return flag;
    }
}
