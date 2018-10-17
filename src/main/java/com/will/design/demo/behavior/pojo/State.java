package com.will.design.demo.behavior.pojo;

import lombok.Data;

/**
 * @author will
 */
@Data
public class State {

    private String value;

    public State(String value) {
        this.value = value;
    }
}
