package com.changyuan.pizzaSimpleFactoryDemo;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza(String style, String type) {
        Pizza pizza;
        pizza = factory.createPizza(style, type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
