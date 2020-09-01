package com.prototype;


/**
 * @desc : 圆形
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
