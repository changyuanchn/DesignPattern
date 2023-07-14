package com.changyuan.compositePattern;

public class RubberDuck implements Quackable {
    Observable observable;
    public RubberDuck() {
        observable = new Observable(this);
    }
    public void quack() {
        System.out.println("Squeak!");
        notifyObserver();
    }
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObserver() {
        observable.notifyObserver();
    }
}
