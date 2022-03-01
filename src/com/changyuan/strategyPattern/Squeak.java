package com.changyuan.strategyPattern;

public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak!");
    }
}
