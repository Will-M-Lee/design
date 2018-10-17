package com.will.design.demo.behavior.service;

/**
 * @author will
 */
public interface VisitorSubject {

    public void accept(Visitor visitor);

    public String getVisitorSubject();
}
