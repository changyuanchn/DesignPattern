package com.changyuan.IteratorPattern.baseDemo;

public class MenuDemoTest {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();

        System.out.println("-------  Get All menu  -------");
        waitress.printMenu();
        System.out.println("-------  End  -------");

        System.out.println("-------  Get Vegetarian Menu  -------");
        waitress.printVegetarianMenu();
        System.out.println("-------  End  -------");
    }
}
