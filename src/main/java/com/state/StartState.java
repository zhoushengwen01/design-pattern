package com.state;

/**
 * @desc :开始状态
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/

public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}

