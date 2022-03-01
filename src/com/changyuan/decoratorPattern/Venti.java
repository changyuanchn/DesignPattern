package com.changyuan.decoratorPattern;

public class Venti extends SizeDecorator {
    Beverage beverage;
    public Venti(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", venti";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
