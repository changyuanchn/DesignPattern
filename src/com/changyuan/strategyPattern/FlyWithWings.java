package com.changyuan.strategyPattern;

public class FlyWithWings implements FlyBehavior{
    public void fly() {
        System.out.println("I am flying!");
    }
}
