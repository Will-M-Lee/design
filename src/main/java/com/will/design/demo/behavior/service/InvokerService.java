package com.will.design.demo.behavior.service;

/**
 * @author will
 */
public class InvokerService {

    private CommandService commandService;

    public InvokerService(CommandService commandService) {
        this.commandService = commandService;
    }

    public void action(){
        commandService.action();
    }
}
