package com.will.design.demo.construction.service.impl;

import com.will.design.demo.construction.service.TargetableService;

/**
 * @author will
 */
public class Proxy implements TargetableService {

    private TargetableService targetableService;

    public Proxy(TargetableService targetableService) {
        super();
        this.targetableService = targetableService;
    }

    @Override
    public void method1() {
        before();
        targetableService.method1();
    }

    @Override
    public void method2() {
        before();
        targetableService.method2();

    }

    private void before() {
        System.out.println("this is proxy before");
    }
}
