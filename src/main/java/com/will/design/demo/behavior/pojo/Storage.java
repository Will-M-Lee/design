package com.will.design.demo.behavior.pojo;

import lombok.Data;

/**
 * @author will
 */
@Data
public class Storage {

    public Memento memento;

    public void store(Memento memento) {
        this.memento = new Memento(memento.getName());
    }
}
