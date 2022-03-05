package com.mitskevich.task1.observer.impl;

import com.mitskevich.task1.entity.CustomArray;
import com.mitskevich.task1.observer.CustomArrayEvent;
import com.mitskevich.task1.observer.Observable;
import com.mitskevich.task1.observer.Observer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayObservable implements Observable {
    private static final Logger LOGGER = LogManager.getLogger();
    private CustomArrayObserver observer;

    @Override
    public void attach(CustomArrayObserver observer) {
        this.observer = observer;
    }

    @Override
    public void detach(CustomArrayObserver observer) {
        this.observer = null;
    }

    @Override
    public void notifyObservers() {
        CustomArrayEvent event = new CustomArrayEvent((CustomArray) this);
        if (observer != null) {
            observer.parameterChanged(event);
        }
    }
}
