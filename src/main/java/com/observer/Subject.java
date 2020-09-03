package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc : 被观察者
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
