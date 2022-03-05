package com.mitskevich.task1.parser;

import java.util.List;

public interface CustomParsingService {
    int[] parseLineToArray(String line);

    List<int[]> parseTextToArray(List<String> text);
}
