package com.changyuan.coffeeDemo;

public class Grande extends SizeDecorator {
    Beverage beverage;
    public Grande(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", grande";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}