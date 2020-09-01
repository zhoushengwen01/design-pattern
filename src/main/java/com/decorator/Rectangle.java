package com.decorator;

/**
 * @desc : 方形状
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
