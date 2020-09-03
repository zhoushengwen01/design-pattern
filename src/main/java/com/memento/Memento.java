package com.memento;

/**
 * @desc : 记忆
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public  String getState() {
        return state;
    }
}
