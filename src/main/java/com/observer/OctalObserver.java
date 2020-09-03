package com.observer;

/**
 * @desc : 八进制观察者
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
