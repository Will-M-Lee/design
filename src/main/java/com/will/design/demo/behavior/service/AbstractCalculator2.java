package com.will.design.demo.behavior.service;

/**
 * @author will
 */
public abstract class AbstractCalculator2 extends AbstractCalculator {

    public final int calculator(String exp, String opt) {
        Integer[] array = super.split(exp, opt);

        return calculator(array[0], array[1]);
    }

    public abstract int calculator(int i, int j);

}
