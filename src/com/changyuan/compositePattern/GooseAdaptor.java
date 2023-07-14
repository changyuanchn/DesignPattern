package com.changyuan.compositePattern;

public class GooseAdaptor implements Quackable {
    Goose goose;
    Observable observable;
    public GooseAdaptor(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }
    public void quack() {
        goose.honk();
    }
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObserver() {
        observable.notifyObserver();
    }
}
