package com.will.design.demo.behavior.service.impl;

import com.will.design.demo.behavior.service.Collection;
import com.will.design.demo.behavior.service.Iterator;

/**
 * @author will
 */
public class MyIterator implements Iterator {

    private Collection collection;
    private int        pos = -1;

    public MyIterator(MyCollection myCollection) {
        this.collection = myCollection;
    }

    @Override
    public Object perious() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size() - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
