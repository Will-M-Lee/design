package com.will.design.demo.behavior.service.impl;

import com.will.design.demo.behavior.service.AbstractCalculator;
import com.will.design.demo.behavior.service.ICalculator;

/**
 * @author will
 */
public class PlusCalculator extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        Integer[] split = super.split(exp, "\\+");
        Integer   i     = split[0];
        Integer   j     = split[1];
        return i + j;
    }
}
