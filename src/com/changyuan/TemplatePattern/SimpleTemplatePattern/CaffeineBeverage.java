package com.changyuan.TemplatePattern.SimpleTemplatePattern;

public abstract class CaffeineBeverage {
    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("Boiling water!");
    }
    void pourInCup() {
        System.out.println("Pouring into cup!");
    }
}
