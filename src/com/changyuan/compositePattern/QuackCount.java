package com.changyuan.compositePattern;

public class QuackCount implements Quackable {
    Quackable duck;
    Observable observable;
    static int numOfQuacks;
    public QuackCount(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }
    public void quack() {
        duck.quack();
        numOfQuacks++;
    }
    public static int getNumOfQuacks() {
        return numOfQuacks;
    }
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }
    public void notifyObserver() {
        duck.notifyObserver();
    }
}
