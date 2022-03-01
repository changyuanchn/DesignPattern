package com.changyuan.strategyPattern;

public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("<< silence >>!");
    }
}
