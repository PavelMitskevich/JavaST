package com.mitskevich.task1.reader;

import java.util.List;

public interface CustomFileReaderService {
    String readLineFromFile(String fileName);

    List<String> readTextFromFile(String fileName);
}
