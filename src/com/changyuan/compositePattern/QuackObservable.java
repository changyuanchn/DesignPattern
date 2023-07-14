package com.changyuan.compositePattern;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObserver();
}
