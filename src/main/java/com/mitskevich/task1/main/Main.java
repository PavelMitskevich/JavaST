package com.mitskevich.task1.main;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.entity.CustomArrayParameter;
import com.mitskevich.task1.entity.Warehouse;
import com.mitskevich.task1.parser.CustomParsingService;
import com.mitskevich.task1.parser.impl.CustomParsing;
import com.mitskevich.task1.reader.CustomFileReaderService;
import com.mitskevich.task1.reader.impl.CustomFileReader;
import com.mitskevich.task1.service.ArrayCalculateService;
import com.mitskevich.task1.service.ArraySearchingService;
import com.mitskevich.task1.service.impl.ArrayCalculateServiceImpl;
import com.mitskevich.task1.service.impl.ArraySearchingServiceImpl;
import lombok.SneakyThrows;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4});
        System.out.println(customArray + " array");
        CustomArray customArray1 = new CustomArray();
//
        CustomFileReaderService readerService = new CustomFileReader();
        String line = readerService.readLineFromFile("C:\\Users\\Иван\\IdeaProjects\\JavaST\\src\\main\\resources\\array.txt");
        CustomParsingService parsingService = new CustomParsing();
        int[] array = parsingService.parseLineToArray(line);

        customArray1.setArray(array);

        System.out.println(customArray1 + " array1");

        ArrayCalculateService calculateService = new ArrayCalculateServiceImpl();
        OptionalInt sum = calculateService.sumOfElements(customArray);
        OptionalDouble average = calculateService.averageOfArray(customArray);
        OptionalInt sum1 = calculateService.sumOfElements(customArray1);
        OptionalDouble average1 = calculateService.averageOfArray(customArray1);

        ArraySearchingService searchingService = new ArraySearchingServiceImpl();
        OptionalInt max = searchingService.searchingMaximum(customArray);
        OptionalInt min = searchingService.searchingMinimal(customArray);
        OptionalInt max1 = searchingService.searchingMaximum(customArray1);
        OptionalInt min1 = searchingService.searchingMinimal(customArray1);

        CustomArrayParameter customArrayParameter = new CustomArrayParameter(max, min, sum, average);
        CustomArrayParameter customArrayParameter1 = new CustomArrayParameter(max1,min1,sum1,average1);

        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(customArray.getArrayId(), customArrayParameter);
        warehouse.put(customArray1.getArrayId(), customArrayParameter1);
        System.out.println(warehouse);

        customArray.setArray(2, 3, 4, 5);
        customArray1.setArray(1,3,5,7);

        System.out.println(warehouse);

    }
}
