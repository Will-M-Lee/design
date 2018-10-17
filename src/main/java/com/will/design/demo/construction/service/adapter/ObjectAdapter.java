package com.will.design.demo.construction.service.adapter;

import com.will.design.demo.construction.service.SourceService;
import com.will.design.demo.construction.service.TargetableService;

/**
 * @author will
 */
public class ObjectAdapter implements TargetableService {

    private SourceService sourceService;

    public ObjectAdapter(SourceService sourceService) {
        super();
        this.sourceService = sourceService;
    }

    @Override
    public void method1() {
        sourceService.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is ObjectAdapter method2");
    }
}
