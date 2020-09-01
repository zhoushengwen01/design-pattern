package com.decorator;

/**
 * @desc : 方形
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
