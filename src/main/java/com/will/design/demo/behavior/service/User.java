package com.will.design.demo.behavior.service;

/**
 * @author will
 */
public abstract class User {

    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return this.getMediator();
    }

    public abstract void action();
}
