package com.mitskevich.task1.observer;

import com.mitskevich.task1.entity.CustomArray;

import java.util.EventObject;

public class CustomArrayEvent extends EventObject {
    public CustomArrayEvent(Object source) {
        super(source);
    }

    public CustomArray getSource() {
        return (CustomArray) super.getSource();
    }
}
