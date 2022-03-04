package com.mitskevich.task1.reader.impl;

import com.mitskevich.task1.parser.impl.CustomParsing;
import com.mitskevich.task1.reader.CustomFileReaderService;
import com.mitskevich.task1.validator.impl.CustomValidator;
import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CustomFileReader implements CustomFileReaderService {
    private static final Logger LOGGER = LogManager.getLogger();
    public final String ARRAY_TXT = "C:\\Users\\Иван\\IdeaProjects\\JavaST\\src\\main\\resources\\array.txt";
    BufferedReader bufferedReader;
    CustomValidator customValidator = new CustomValidator();
    CustomParsing customParsing = new CustomParsing();

    @SneakyThrows
    @Override
    public int[] readTextFromFile(String fileName) {
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                if (customValidator.isFirstValidLine(value)) {
                    return customParsing.parseToArray(value);
                }
            }
        } catch (IOException e) {
            LOGGER.error("This is exception: ",e);
        }
        bufferedReader.close();
        return null;
    }

    public static void main(String[] args) {
        CustomFileReader customFileReader = new CustomFileReader();
        System.out.println(Arrays.toString(customFileReader.readTextFromFile(customFileReader.ARRAY_TXT)));
    }
}
