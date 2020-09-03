package com.observer;

/**
 * @desc : 十六进制观察者
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
