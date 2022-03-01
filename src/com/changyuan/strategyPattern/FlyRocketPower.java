package com.changyuan.strategyPattern;

public class FlyRocketPower implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
