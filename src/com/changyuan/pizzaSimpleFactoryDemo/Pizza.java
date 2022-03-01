package com.changyuan.pizzaSimpleFactoryDemo;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Prepare " + name + ".");
    }

    void bake() {
        System.out.println("Bake pizza for 25 minutes.");
    }

    void cut() {
        System.out.println("Cut pizza to 8 slices.");
    }

    void box() {
        System.out.println("Boxing pizza");
    }

    public String getName() {
        return name;
    }
}
