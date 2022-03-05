package com.mitskevich.task1.observer.impl;

import com.mitskevich.task1.observer.Observable;
import com.mitskevich.task1.observer.Observer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayObservable implements Observable {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void attach(Observer observer) {

    }

    @Override
    public void detach(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
