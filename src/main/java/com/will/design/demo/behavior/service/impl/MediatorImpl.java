package com.will.design.demo.behavior.service.impl;

import com.will.design.demo.behavior.pojo.User1;
import com.will.design.demo.behavior.pojo.User2;
import com.will.design.demo.behavior.service.Mediator;

/**
 * @author will
 */
public class MediatorImpl implements Mediator {

    private User1 user1;
    private User2 user2;

    @Override
    public void create() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.action();
        user2.action();
    }
}
