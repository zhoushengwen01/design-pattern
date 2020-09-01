package com.prototype;


/**
 * @desc :方形
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
