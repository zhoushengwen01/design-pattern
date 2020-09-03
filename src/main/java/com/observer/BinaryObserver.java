package com.observer;

/**
 * @desc : 二进制观察者
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
