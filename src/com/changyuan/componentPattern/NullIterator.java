package com.changyuan.componentPattern;

import java.util.*;

public class NullIterator implements Iterator {

    @Override
    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}
