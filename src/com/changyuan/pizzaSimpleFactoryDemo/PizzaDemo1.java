package com.changyuan.pizzaSimpleFactoryDemo;

public class PizzaDemo1 {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore nyStore = new PizzaStore(factory);
        nyStore.orderPizza("NY", "cheese");
        PizzaStore chicagoStore = new PizzaStore(factory);
        chicagoStore.orderPizza("Chicago", "veggie");
    }
}
