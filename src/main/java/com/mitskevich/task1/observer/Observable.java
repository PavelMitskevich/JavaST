package com.mitskevich.task1.observer;

import com.mitskevich.task1.observer.impl.CustomArrayObserver;

public interface Observable {
    void attach(CustomArrayObserver observer);

    void detach(CustomArrayObserver observer);

    void notifyObservers();
}
