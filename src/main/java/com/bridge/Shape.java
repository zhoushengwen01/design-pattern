package com.bridge;

/**
 * @desc : 形状
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

