package com.will.design.demo.create.service.factory;

import com.will.design.demo.create.service.SenderService;
import com.will.design.demo.create.service.imp.EmailSenderServiceImp;
import com.will.design.demo.create.service.imp.SmsSenderServiceImp;

/**
 * @author will
 */
public class StaticFactory {
    public static SenderService EmailFatory() {
        return new EmailSenderServiceImp();
    }

    public static SenderService SmsFactory() {
        return new SmsSenderServiceImp();
    }
}
