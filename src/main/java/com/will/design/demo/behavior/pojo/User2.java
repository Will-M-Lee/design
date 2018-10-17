package com.will.design.demo.behavior.pojo;

import com.will.design.demo.behavior.service.Mediator;
import com.will.design.demo.behavior.service.User;

/**
 * @author will
 */
public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("this is User2");
    }
}
