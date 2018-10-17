package com.will.design.demo.behavior.service.impl;

import com.will.design.demo.behavior.service.Collection;
import com.will.design.demo.behavior.service.Iterator;

/**
 * @author will
 */
public class MyCollection implements Collection {

    public String str[] = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return str[i];
    }

    @Override
    public int size() {
        return str.length;
    }
}
