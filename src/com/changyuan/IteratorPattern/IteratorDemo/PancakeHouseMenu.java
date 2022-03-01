package com.changyuan.IteratorPattern.IteratorDemo;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&R C pancake",
                "This is C Bible",
                true,
                1.99);

        addItem("Bjarne C++ pancake",
                "This is a magic C++ language",
                false,
                2.99);

        addItem("Guido Python pancake",
                "This is a simple and useful language",
                true,
                3.99);

        addItem("Gosling java pancake",
                "Nothing to say!",
                false,
                4.99);
    }

    public void addItem(String name,
                        String description,
                        boolean vegetarian,
                        double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
