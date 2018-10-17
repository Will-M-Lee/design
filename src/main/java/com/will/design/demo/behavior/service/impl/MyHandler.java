package com.will.design.demo.behavior.service.impl;

import com.will.design.demo.behavior.service.AbstractHandler;
import com.will.design.demo.behavior.service.Handler;

/**
 * @author will
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println("this is "+name);
        if (getHandler() != null) {
            getHandler().action();
        }
    }
}
