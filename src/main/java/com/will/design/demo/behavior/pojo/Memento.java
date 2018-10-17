package com.will.design.demo.behavior.pojo;

import lombok.Data;

/**
 * @author will
 */
@Data
public class Memento {

    public String name;

    public Memento(String name) {
        this.name = name;
    }

    public Memento changeName(String name) {
        this.name = name;
        return this;
    }


    public Memento reStore(Memento memento) {
        return memento;
    }
}
