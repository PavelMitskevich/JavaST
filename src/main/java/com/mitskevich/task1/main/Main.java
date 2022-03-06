package com.mitskevich.task1.main;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.entity.CustomArrayParameter;
import com.mitskevich.task1.entity.Warehouse;
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
        System.out.println(customArray);

        ArrayCalculateService calculateService = new ArrayCalculateServiceImpl();
        OptionalInt sum = calculateService.sumOfElements(customArray);
        OptionalDouble average = calculateService.averageOfArray(customArray);

        ArraySearchingService searchingService = new ArraySearchingServiceImpl();
        OptionalInt max = searchingService.searchingMaximum(customArray);
        OptionalInt min = searchingService.searchingMinimal(customArray);

        CustomArrayParameter customArrayParameter = new CustomArrayParameter(max,min,sum,average);

        Warehouse warehouse = Warehouse.getInstance();

        warehouse.put(customArray.getArrayId(), customArrayParameter);

        System.out.println(warehouse);

        customArray.setArray(2, 3, 4, 5);

        System.out.println(warehouse);

    }
}
