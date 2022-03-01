package com.changyuan.componentPattern;

public class MenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "BREAKFAST");
        MenuComponent lunchMenu = new Menu("LUNCH MENU", "LUNCH");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "DINNER");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "CAFE");

        MenuComponent allMenus = new Menu("ALL MENUS", "ALL MENUS COMBINED");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        dinnerMenu.add(new MenuItem("Pasta",
                "Spaghetti with Marinara Sauce",
                true,
                1.99));

        dinnerMenu.add(cafeMenu);

        cafeMenu.add(new MenuItem("latte",
                "cafe with milk",
                true,
                0.99));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();

        waitress.printVegetarianMenu();

    }
}
