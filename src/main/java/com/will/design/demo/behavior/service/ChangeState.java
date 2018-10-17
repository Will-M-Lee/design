package com.will.design.demo.behavior.service;

import com.will.design.demo.behavior.pojo.State;
import lombok.Data;

/**
 * @author will
 */
@Data
public class ChangeState {

    private State state;

    public ChangeState(State state) {
        this.state = state;
    }

    public void action() {
        if (state.getValue().equals("1")) {
            System.out.println("this is changeState 1");
        } else if (state.getValue().equals("2")) {
            System.out.println("this is changeState 2");
        } else {
            System.out.println("this is changeState others");
        }
    }
}
