package com.will.design.demo.behavior.pojo;

import lombok.Data;

/**
 * @author will
 */
@Data
public class Original {

    private String  name;
    private Memento memento;

    public Original(String name) {
        this.name = name;
    }

    public Memento create() {
        return new Memento(name);
    }

    public void reStore(Memento memento) {

        this.memento = new Memento(memento.getName());
    }
}
