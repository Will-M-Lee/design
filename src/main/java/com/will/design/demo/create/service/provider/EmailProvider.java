package com.will.design.demo.create.service.provider;

import com.will.design.demo.create.service.SenderService;
import com.will.design.demo.create.service.imp.EmailSenderServiceImp;

/**
 * @author will
 */
public class EmailProvider implements FactoryProvider {
    @Override
    public SenderService provider() {
        return new EmailSenderServiceImp();
    }
}
