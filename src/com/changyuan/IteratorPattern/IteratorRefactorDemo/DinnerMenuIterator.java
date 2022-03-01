package com.changyuan.IteratorPattern.IteratorRefactorDemo;

import java.util.Iterator;
public class DinnerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        MenuItem menuItem = menuItems[position++];
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }
}
