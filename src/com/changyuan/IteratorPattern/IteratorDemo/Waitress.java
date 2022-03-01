package com.changyuan.IteratorPattern.IteratorDemo;

import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;

    public Waitress (PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("-------  Get breakfast  -------");
        printMenu(pancakeIterator);
        System.out.println("-------  End  -------");
        System.out.println("-------  Get lunch  -------");
        printMenu(dinnerIterator);
        System.out.println("-------  End  -------");
    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }

    public void printVegetarianMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("-------  Get vegetarian breakfast  -------");
        printVegetarianMenu(pancakeIterator);
        System.out.println("-------  End  -------");
        System.out.println("-------  Get vegetarian lunch  -------");
        printVegetarianMenu(dinnerIterator);
        System.out.println("-------  End  -------");
    }

    public void printVegetarianMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem.getVegeratian()) {
                System.out.print(menuItem.getName() + " ");
                System.out.println(menuItem.getPrice() + " ");
                System.out.println(menuItem.getDescription() + " ");
            }
        }
    }
}
