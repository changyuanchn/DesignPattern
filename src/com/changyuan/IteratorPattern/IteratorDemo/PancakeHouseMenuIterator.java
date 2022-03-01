package com.changyuan.IteratorPattern.IteratorDemo;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position++);
        return menuItem;
    }
}
