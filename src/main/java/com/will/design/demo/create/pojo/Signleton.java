package com.will.design.demo.create.pojo;

/**
 * @author will
 */
public class Signleton {

    private static Signleton signleton = null;

    private Signleton() {

    }

    private static synchronized void init() {
        if (signleton == null) {
            new Signleton();
        }
    }

    public static Signleton getSignleton() {
        if (signleton == null) {
            init();
        }
        return signleton;
    }

    public Object readResolve() {
        return signleton;
    }
}
