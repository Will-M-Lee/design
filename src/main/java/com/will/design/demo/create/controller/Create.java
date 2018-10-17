package com.will.design.demo.create.controller;

import com.will.design.demo.create.pojo.Prototype;
import com.will.design.demo.create.pojo.Signleton;
import com.will.design.demo.create.service.SenderService;
import com.will.design.demo.create.service.builder.Builder;
import com.will.design.demo.create.service.factory.MultiFactory;
import com.will.design.demo.create.service.factory.SendFactory;
import com.will.design.demo.create.service.factory.StaticFactory;
import com.will.design.demo.create.service.provider.EmailProvider;
import com.will.design.demo.create.service.provider.FactoryProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author will
 */
@Slf4j
@RestController
@RequestMapping(value = "/create")
public class Create {

    /**
     * 工厂方法模式（factory Method）
     */
    @GetMapping(value = "/factory_method")
    public void factoryMethod() {
        SendFactory   sendFactory   = new SendFactory();
        SenderService senderService = sendFactory.sender("Email");
        senderService.sout();
    }

    /**
     * 多个工厂方法模式
     */
    @GetMapping(value = "/multi_factory")
    public void multiFactory() {
        MultiFactory  multiFactory  = new MultiFactory();
        SenderService senderService = multiFactory.EmailFatory();
        senderService.sout();
    }

    /**
     * 静态工厂方法模式
     */
    @GetMapping(value = "/static_factory")
    public void staticfactory() {
        SenderService senderService = StaticFactory.SmsFactory();
        senderService.sout();
    }

    /**
     * 抽象工厂模式（Abstract factory）
     */
    @GetMapping(value = "/abstract_factory")
    public void abstractFactory() {
        FactoryProvider factoryProvider = new EmailProvider();
        SenderService   senderService   = factoryProvider.provider();
        senderService.sout();
    }

    /**
     * 单例模式（Singleton）
     */
    @GetMapping(value = "/singlton")
    public void singleton() {
        Signleton signleton = Signleton.getSignleton();
        System.out.println(signleton.toString());
    }

    /**
     * 建造者模式（builder）
     */
    @GetMapping(value = "/build")
    public void builder() {
        Builder builder = new Builder();
        builder.emailSender(6);
    }

    /**
     * 原型模式（Prototype）
     */
    @GetMapping(value = "/prototype")
    public void prototype() throws IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        Object    o         = prototype.deepClone();
        System.out.println(o.toString());
    }
}
