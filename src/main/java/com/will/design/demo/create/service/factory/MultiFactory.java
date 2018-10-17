package com.will.design.demo.create.service.factory;

import com.will.design.demo.create.service.SenderService;
import com.will.design.demo.create.service.imp.EmailSenderServiceImp;
import com.will.design.demo.create.service.imp.SmsSenderServiceImp;

/**
 * @author will
 */
public class MultiFactory {

    public SenderService EmailFatory() {
        return new EmailSenderServiceImp();
    }

    public SenderService SmsFactory() {
        return new SmsSenderServiceImp();
    }
}
