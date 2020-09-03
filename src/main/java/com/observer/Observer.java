package com.observer;

/**
 * @desc : 观察者抽象类
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public abstract class Observer {
    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public abstract void update();
}
