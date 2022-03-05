package com.changyuan.adapterPattern.animals;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble!");
    }
    public void fly() {
        System.out.println("Flying a short distance");
    }
}
