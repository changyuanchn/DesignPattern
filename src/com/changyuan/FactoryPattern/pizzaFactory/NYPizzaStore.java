package com.changyuan.FactoryPattern.pizzaFactory;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        }
        return null;
    }
}
