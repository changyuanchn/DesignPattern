package com.changyuan.IteratorPattern.IteratorRefactorDemo;

import java.util.Iterator;
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("-------  Get breakfast  -------");
        printMenu(pancakeIterator);
        System.out.println("-------  End  -------");
        System.out.println("-------  Get lunch  -------");
        printMenu(dinnerIterator);
        System.out.println("-------  End  -------");
        System.out.println("-------  Get supper  -------");
        printMenu(cafeIterator);
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
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("-------  Get vegetarian breakfast  -------");
        printVegetarianMenu(pancakeIterator);
        printVegetarianMenu(dinnerIterator);
        printVegetarianMenu(cafeIterator);
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
