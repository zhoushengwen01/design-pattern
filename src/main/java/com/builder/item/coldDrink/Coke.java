package com.builder.item.coldDrink;

/**
 * @desc : 可口可乐
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}

