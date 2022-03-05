package com.changyuan.FactoryPattern.pizzaFactory;

public class PizzaDemo2 {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ahmed ordered a " + pizza.getName() + '\n');
        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Bob ordered a " + pizza.getName() + '\n');
    }
}
