package com.will.design.demo.create.service.builder;

import com.google.common.collect.Lists;
import com.will.design.demo.create.service.SenderService;
import com.will.design.demo.create.service.imp.EmailSenderServiceImp;
import com.will.design.demo.create.service.imp.SmsSenderServiceImp;

import java.util.List;

/**
 * @author will
 */
public class Builder {

    private List<SenderService> senderServices = Lists.newArrayList();

    public void emailSender(int j) {
        for (int i = 0; i < j; i++) {
            senderServices.add(new EmailSenderServiceImp());
        }
        senderServices.forEach(SenderService::sout);
    }

    public void smsSender(int j) {
        for (int i = 0; i < j; i++) {
            senderServices.add(new SmsSenderServiceImp());
        }
        senderServices.forEach(SenderService::sout);
    }

}
