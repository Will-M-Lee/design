package com.will.design.demo.create.service.provider;

import com.will.design.demo.create.service.SenderService;
import com.will.design.demo.create.service.imp.SmsSenderServiceImp;

/**
 * @author will
 */
public class SmsProvider implements FactoryProvider {
    @Override
    public SenderService provider() {
        return new SmsSenderServiceImp();
    }
}
