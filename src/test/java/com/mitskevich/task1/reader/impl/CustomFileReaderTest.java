package com.mitskevich.task1.reader.impl;

import com.mitskevich.task1.reader.CustomFileReaderService;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CustomFileReaderTest {
    CustomFileReaderService readerService = new CustomFileReader();

    final String FILE = "C:\\Users\\Иван\\IdeaProjects\\JavaST\\src\\main\\resources\\array.txt";

    @Test
    public void testReadLineFromFile() {
        String actual = readerService.readLineFromFile(FILE);
        String expected = "-1 -2 -3 -4 10 5";
        assertEquals(actual, expected);
    }

    @Test
    public void testReadTextFromFile() {
        List<String> actual = readerService.readTextFromFile(FILE);
        List<String> expected = new ArrayList<>();
        expected.add("-1 -2 -3 -4 10 5");
        expected.add("6, 8, 4, 5, 3");
        assertEquals(actual, expected);
    }
}