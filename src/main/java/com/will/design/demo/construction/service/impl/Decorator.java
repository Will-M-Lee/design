package com.will.design.demo.construction.service.impl;

import com.will.design.demo.construction.service.TargetableService;

/**
 * @author will
 */
public class Decorator implements TargetableService {

    private TargetableService targetableService;

    public Decorator(TargetableService targetableService) {
        super();
        this.targetableService = targetableService;
    }

    @Override
    public void method1() {
        System.out.println("this is Decorator method1 before");
        targetableService.method1();
        System.out.println("this is Decorator method1 after");
    }

    @Override
    public void method2() {
        System.out.println("this is Decorator method2 before");
        targetableService.method2();
        System.out.println("this is Decorator method2 after");
    }
}
