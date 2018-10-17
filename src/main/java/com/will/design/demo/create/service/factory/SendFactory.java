package com.will.design.demo.create.service.factory;

import com.will.design.demo.create.service.SenderService;
import com.will.design.demo.create.service.imp.EmailSenderServiceImp;
import com.will.design.demo.create.service.imp.SmsSenderServiceImp;

/**
 * @author will
 */
public class SendFactory {

    public SenderService sender(String type) {
        if ("Email".equals(type)) {
            return new EmailSenderServiceImp();
        }
        else if ("Sms".equals(type)) {
            return new SmsSenderServiceImp();
        }
        else {
            return null;
        }

    }
}
