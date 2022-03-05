package com.changyuan.FactoryPattern.pizzaDemo;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY style clam pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}