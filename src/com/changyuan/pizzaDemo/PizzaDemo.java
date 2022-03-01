package com.changyuan.pizzaDemo;

public class PizzaDemo {
    public static void main(String[] args) {
        PizzaStore nyStore = new PizzaStore();
        nyStore.orderPizza("NY", "cheese");
        PizzaStore chicagoStore = new PizzaStore();
        chicagoStore.orderPizza("Chicago", "veggie");
    }
}
