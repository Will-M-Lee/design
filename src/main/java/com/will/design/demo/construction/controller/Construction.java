package com.will.design.demo.construction.controller;

import com.will.design.demo.construction.pojo.Composite;
import com.will.design.demo.construction.service.SourceService;
import com.will.design.demo.construction.service.TargetableService;
import com.will.design.demo.construction.service.Wrapper2;
import com.will.design.demo.construction.service.adapter.ClassAdapter;
import com.will.design.demo.construction.service.adapter.InterfaceAdapter1;
import com.will.design.demo.construction.service.adapter.InterfaceAdapter2;
import com.will.design.demo.construction.service.adapter.ObjectAdapter;
import com.will.design.demo.construction.service.impl.Decorator;
import com.will.design.demo.construction.service.impl.Proxy;
import com.will.design.demo.construction.service.impl.TargetableServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author will
 */
@Slf4j
@RestController
@RequestMapping(value = "/construction")
public class Construction {

    /**
     * 适配器模式(Adapter)
     * 类适配
     */
    @GetMapping(value = "/adapter")
    public void adapter() {
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.method1();
        classAdapter.method2();
    }

    /**
     * 对象适配
     */
    @GetMapping(value = "/object_adapter")
    public void objectAdapter() {
        SourceService sourceService = new SourceService();
        ObjectAdapter objectAdapter = new ObjectAdapter(sourceService);
        objectAdapter.method1();
        objectAdapter.method2();
    }

    /**
     * 接口适配
     */
    @GetMapping(value = "/interface_adapter")
    public void interfaceAdaper() {
        InterfaceAdapter1 adapter1 = new InterfaceAdapter1();
        InterfaceAdapter2 adapter2 = new InterfaceAdapter2();

        adapter1.method1();
        adapter1.method2();

        adapter2.method1();
        adapter2.method2();
    }

    /**
     * 装饰模式（Decorator）
     */
    @GetMapping(value = "/decorator")
    public void decorator() {
        TargetableService targetableService = new TargetableServiceImpl();
        Decorator         decorator         = new Decorator(targetableService);
        decorator.method1();
        decorator.method2();
    }

    /**
     * 代理模式(Proxy)
     */
    @GetMapping(value = "/proxy")
    public void proxy() {
        TargetableService targetableService = new TargetableServiceImpl();
        Proxy             proxy             = new Proxy(targetableService);
        proxy.method1();
        proxy.method2();
    }

    /**
     * 外观模式（Facade)
     */
    @GetMapping(value = "/facade")
    public void facade() {
        SourceService     sourceService     = new SourceService();
        TargetableService targetableService = new ObjectAdapter(sourceService);
        Wrapper2          wrapper2          = new InterfaceAdapter1();

        targetableService.method1();
        targetableService.method2();
        wrapper2.method1();
        wrapper2.method2();//无输出,因为wrapper2 method2方法体为空
    }

    /**
     * 桥接模式（Bridge）
     */
    @GetMapping(value = "/bridge")
    public void bridge() {
        Wrapper2 wrapper1 = new InterfaceAdapter1();
        Wrapper2 wrapper2 = new InterfaceAdapter2();
        wrapper1.method1();
        System.out.println("================I'm separate line================");
        wrapper2.method1();
    }

    /**
     * 组合模式（Composite）
     */
    @GetMapping(value = "/composite")
    public void composite() {
        Composite compositeA = new Composite("A");
        Composite compositeB = new Composite("B");
        Composite compositeC = new Composite("C");

        compositeB.getComposites().add(compositeC);
        compositeA.getComposites().add(compositeB);

        System.out.println(compositeA.toString());
    }
}

