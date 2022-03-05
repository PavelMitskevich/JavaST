package com.mitskevich.task1.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static Warehouse instance;
    private final Map<Integer, CustomArrayParameter> arrayParameterMap;

    private Warehouse() {
        arrayParameterMap = new HashMap<>();
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public CustomArrayParameter get(Integer id) {
        return this.arrayParameterMap.get(id);
    }

    public CustomArrayParameter put(Integer id, CustomArrayParameter value) {
        return this.arrayParameterMap.put(id, value);
    }

    public CustomArrayParameter remove(Integer id) {
        return this.arrayParameterMap.remove(id);
    }
}
