package com.changyuan.IteratorPattern.IteratorDemo;

public class MenuIteratorDemoTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);

        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
