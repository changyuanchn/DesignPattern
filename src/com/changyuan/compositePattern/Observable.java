package com.changyuan.compositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;
    public Observable(QuackObservable duck) {
        this.duck = duck;
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void notifyObserver() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
