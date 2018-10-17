package com.will.design.demo.behavior.service.impl;

import lombok.Getter;
import lombok.ToString;

import java.util.Observable;

/**
 * @author will
 */
@Getter
@ToString
public class Subject extends Observable {

    private String info;

    public void sendMessage(String info) {
        this.info = info + " pull";
        System.out.println("我就是我,颜色不一样的烟火");
        setChanged();
        notifyObservers(info + " push");
    }
}
