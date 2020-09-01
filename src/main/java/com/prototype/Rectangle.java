package com.prototype;


/**
 * @desc : 三角形
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
