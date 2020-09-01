package com.decorator;

/**
 * @desc : Shape 接口的抽象装饰类
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

