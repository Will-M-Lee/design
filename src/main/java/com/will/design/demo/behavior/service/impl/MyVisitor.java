package com.will.design.demo.behavior.service.impl;

import com.will.design.demo.behavior.service.Visitor;
import com.will.design.demo.behavior.service.VisitorSubject;

/**
 * @author will
 */
public class MyVisitor implements Visitor {
    @Override
    public void visitor(VisitorSubject subject) {
        System.out.println("visitor the " + subject.getVisitorSubject());
    }
}
