package com.mitskevich.task1.observer.impl;

import com.mitskevich.task1.observer.CustomArrayEvent;
import com.mitskevich.task1.observer.Observable;

public class CustomArrayObservable implements Observable {
    private CustomArrayObserver observer;

    @Override
    public void attach(CustomArrayObserver observer) {
        this.observer = observer;
    }

    @Override
    public void detach() {
        this.observer = null;
    }

    @Override
    public void notifyObservers() {
        CustomArrayEvent event = new CustomArrayEvent(this);
        if (observer != null) {
            observer.parameterChanged(event);
        }
    }
}
