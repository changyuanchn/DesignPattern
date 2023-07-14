package com.changyuan.compositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    Observable observable;
    public Flock() {
        observable = new Observable(this);
    }
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.registerObserver(observer);
        }
    }
    public void notifyObserver() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.notifyObserver();
        }
    }
}
