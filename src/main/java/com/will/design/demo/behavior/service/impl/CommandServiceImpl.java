package com.will.design.demo.behavior.service.impl;

import com.will.design.demo.behavior.service.CommandService;
import com.will.design.demo.behavior.service.ReceiverService;

/**
 * @author will
 */
public class CommandServiceImpl implements CommandService {

    private ReceiverService receiverService;

    public CommandServiceImpl(ReceiverService receiverService) {
        this.receiverService = receiverService;
    }

    @Override
    public void action() {
        receiverService.action();
    }
}
