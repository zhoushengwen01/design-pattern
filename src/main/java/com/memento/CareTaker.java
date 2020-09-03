package com.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc : 记忆存储
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class CareTaker {
    private List<Memento> mementos = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

}
