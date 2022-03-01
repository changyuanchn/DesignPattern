package com.changyuan.IteratorPattern.baseDemo;

import java.util.ArrayList;

public class Waitress {
    ArrayList breakfastItems;
    MenuItem[] lunchItems;

    public Waitress () {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        breakfastItems = pancakeHouseMenu.getMenuItems();

        DinnerMenu dinnerMenu = new DinnerMenu();
        lunchItems = dinnerMenu.getMenuItems();
    }
    public void printMenu() {
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem)breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }

    public void printVegetarianMenu() {
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem)breakfastItems.get(i);
            if (menuItem.getVegeratian()) {
                System.out.print(menuItem.getName() + " ");
                System.out.println(menuItem.getPrice() + " ");
                System.out.println(menuItem.getDescription() + " ");
            }
        }

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            if (menuItem.getVegeratian()) {
                System.out.print(menuItem.getName() + " ");
                System.out.println(menuItem.getPrice() + " ");
                System.out.println(menuItem.getDescription() + " ");
            }
        }
    }
}
