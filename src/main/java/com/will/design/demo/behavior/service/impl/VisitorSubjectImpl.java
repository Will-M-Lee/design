package com.will.design.demo.behavior.service.impl;

import com.will.design.demo.behavior.service.Visitor;
import com.will.design.demo.behavior.service.VisitorSubject;

/**
 * @author will
 */
public class VisitorSubjectImpl implements VisitorSubject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    @Override
    public String getVisitorSubject() {
        return "will's visitorSubject";
    }
}
