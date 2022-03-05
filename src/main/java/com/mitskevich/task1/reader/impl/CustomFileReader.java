package com.mitskevich.task1.reader.impl;

import com.mitskevich.task1.reader.CustomFileReaderService;
import com.mitskevich.task1.validator.impl.CustomValidator;
import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomFileReader implements CustomFileReaderService {
    private static final Logger LOGGER = LogManager.getLogger();
//    public final String ARRAY_TXT = "C:\\Users\\Иван\\IdeaProjects\\JavaST\\src\\main\\resources\\array.txt";
    BufferedReader bufferedReader;
    CustomValidator customValidator = new CustomValidator();

    @SneakyThrows
    @Override
    public String readLineFromFile(String fileName) {
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                if (customValidator.isValidLine(value)) {
                    return value;
                }
            }
        } catch (IOException e) {
            LOGGER.error("This is exception: ", e);
        }
        bufferedReader.close();
        return null;
    }

    @SneakyThrows
    @Override
    public List<String> readTextFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                if (customValidator.isValidLine(value)) {
                    lines.add(value);
                    return lines;
                }
            }
        } catch (IOException e) {
            LOGGER.error("This is exception: ", e);
        }
        bufferedReader.close();
        return null;
    }
}
