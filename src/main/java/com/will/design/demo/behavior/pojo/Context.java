package com.will.design.demo.behavior.pojo;

import lombok.Data;

/**
 * @author will
 */
@Data
public class Context {
    private int num1;
    private int num2;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
