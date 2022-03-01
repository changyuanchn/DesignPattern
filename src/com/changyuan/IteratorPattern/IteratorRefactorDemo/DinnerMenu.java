package com.changyuan.IteratorPattern.IteratorRefactorDemo;

import java.util.Iterator;

public class DinnerMenu implements Menu {
    static final int MAX_VALUE = 4;
    int numberOfItem = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_VALUE];

        addItem("Tomato",
                "Tomato on whole wheat",
                true,
                5.99);

        addItem("Meat",
                "Bacon meat",
                false,
                6.99);

        addItem("Soup",
                "potato soup",
                true,
                7.99);

        addItem("Hotdog",
                "A hot dog",
                false,
                4.99);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItem >= MAX_VALUE) {
            System.err.println("Sorry, the menu is full!");
        } else {
            menuItems[numberOfItem++] = menuItem;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}

