package com.will.design.demo.behavior.controller;

import com.will.design.demo.behavior.pojo.*;
import com.will.design.demo.behavior.service.*;
import com.will.design.demo.behavior.service.impl.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author will
 */
@Slf4j
@RestController
@RequestMapping(value = "/behavior")
public class Behavior {

    /**
     * 策略模式（strategy）
     */
    @GetMapping("/strategy")
    public void strategy() {
        ICalculator iCalculator = new MinusCalculator();
        int calculate = iCalculator.calculate("5-3");
        System.out.println(calculate);
    }

    /**
     * 模板方法模式（Template Method）
     */
    @GetMapping("/template_method")
    public void templateMethod() {
        AbstractCalculator2 abstractCalculator2 = new PlusCalculator2();
        int calculator = abstractCalculator2.calculator("8+6", "\\+");
        System.out.println(calculator);
    }

    /**
     * 观察者模式（Observer）
     */
    @GetMapping("/observer")
    public void observer(@RequestParam(value = "info") String info) {

        Subject subject = new Subject();
        new Observer1(subject);
        new Observer2(subject);

        subject.sendMessage(info);
    }

    /**
     * 迭代子模式（Iterator）
     */
    @GetMapping("/iterator")
    public void iterator() {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator);
        }
    }

    /**
     * 责任链模式（Chain of Responsibility）
     */
    @GetMapping("/chain")
    public void chainOfResponsibility() {
        Handler handler1 = new MyHandler("1");
        Handler handler2 = new MyHandler("2");
        Handler handler3 = new MyHandler("3");

        ((MyHandler) handler1).setHandler(handler2);
        ((MyHandler) handler2).setHandler(handler3);
        handler1.action();
    }

    /**
     * 命令模式（Command）
     */
    @GetMapping("/command")
    public void command() {
        ReceiverService receiverService = new ReceiverService();
        CommandService commandService = new CommandServiceImpl(receiverService);
        InvokerService invokerService = new InvokerService(commandService);
        invokerService.action();
    }

    /**
     * 备忘录模式（Memento）
     */
    @GetMapping("/memento")
    public void memento() {

        Original original = new Original("ori");
        Memento memento = original.create();
        System.out.println(memento.getName());

        Storage storage = new Storage();
        storage.store(memento);

        memento.setName("changeName");
        System.out.println(memento.getName());

        original.reStore(storage.getMemento());
        memento = original.getMemento();
        System.out.println(memento.getName());

    }

    /**
     * 状态模式（State）
     */
    @GetMapping("/state")
    public void state() {
        State state = new State("1");
        ChangeState changeState = new ChangeState(state);
        changeState.action();

        state.setValue("2");
        changeState.action();
    }

    /**
     * 访问者模式（Visitor）
     */
    @GetMapping("/visitor")
    public void visitor() {

        VisitorSubject subject = new VisitorSubjectImpl();
        Visitor visitor = new MyVisitor();
        visitor.visitor(subject);

    }

    /**
     * 中介者模式（Mediator）
     */
    @GetMapping("/mediator")
    public void mediator() {
        Mediator mediator = new MediatorImpl();
        mediator.create();
        mediator.workAll();

    }

    /**
     * 解释器模式（Interpreter）
     */
    @GetMapping("/interpreter")
    public void interpreter() {
//        "9+2-8"
        int i = new MinusExpression().interpret(
                new Context(
                        new PlusExpression().interpret(new Context(9, 2)),
                        8));
        System.err.println(i);
    }

}

