package com.will.design.demo.construction.service.adapter;

import com.will.design.demo.construction.service.SourceService;
import com.will.design.demo.construction.service.TargetableService;

/**
 * @author will
 */
public class ClassAdapter extends SourceService implements TargetableService {
    @Override
    public void method2() {
        System.out.println("this is targetable method2");
    }
}
