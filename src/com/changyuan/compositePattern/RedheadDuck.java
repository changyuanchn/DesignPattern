package com.changyuan.compositePattern;

public class RedheadDuck implements Quackable {
    Observable observable;
    public RedheadDuck() {
        observable = new Observable(this);
    }
    public void quack() {
        System.out.println("quack!");
        notifyObserver();
    }
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObserver() {
        observable.notifyObserver();
    }
}
