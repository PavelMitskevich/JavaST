package com.mitskevich.task1.utils;

import java.util.regex.Pattern;

public class CustomValidator implements CustomValidatorService {
    private static final Pattern PATTERN = Pattern.compile("[-?\\d+\\s]+");
    private boolean flag;

    @Override
    public boolean isFirstValidLine(String text) {
        if (text.matches(PATTERN.pattern())) {
            flag = true;
        }
        return flag;
    }
}
