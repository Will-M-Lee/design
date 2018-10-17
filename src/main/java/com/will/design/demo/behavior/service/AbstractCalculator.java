package com.will.design.demo.behavior.service;

/**
 * @author will
 */
public abstract class AbstractCalculator {

    public Integer[] split(String exp, String opt) {
        String[]  split    = exp.split(opt);
        Integer[] integers = new Integer[2];
        integers[0] = Integer.valueOf(split[0]);
        integers[1] = Integer.valueOf(split[1]);
        return integers;
    }
}
