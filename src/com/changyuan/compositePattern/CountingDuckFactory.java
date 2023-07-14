package com.changyuan.compositePattern;

import com.changyuan.strategyPattern.Quack;

public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCount(new MallardDuck());
    }
    public Quackable createRedheadDuck() {
        return new QuackCount(new RedheadDuck());
    }
    public Quackable createDuckCall() {
        return new QuackCount(new DuckCall());
    }
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }
}
