package com.will.design.demo.behavior.service.impl;

import com.will.design.demo.behavior.pojo.Context;
import com.will.design.demo.behavior.service.Expression;

/**
 * @author will
 */
public class MinusExpression implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
