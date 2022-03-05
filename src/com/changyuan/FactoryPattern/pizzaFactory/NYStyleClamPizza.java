package com.changyuan.FactoryPattern.pizzaFactory;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY style clam pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}