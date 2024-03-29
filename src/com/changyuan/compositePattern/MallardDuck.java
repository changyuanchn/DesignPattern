package com.changyuan.compositePattern;

public class MallardDuck implements Quackable {
    Observable observable;
    public MallardDuck() {
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
