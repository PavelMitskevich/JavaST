package com.mitskevich.task1.utils;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CustomFileReader implements CustomFileReaderService {
    public final String ARRAY_TXT = "C:\\Users\\Иван\\IdeaProjects\\JavaST\\src\\array.txt";
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
            e.printStackTrace();
        }
        bufferedReader.close();
        return null;
    }

    public static void main(String[] args) {
        CustomFileReader customFileReader = new CustomFileReader();
        System.out.println(Arrays.toString(customFileReader.readTextFromFile(customFileReader.ARRAY_TXT)));
    }
}
