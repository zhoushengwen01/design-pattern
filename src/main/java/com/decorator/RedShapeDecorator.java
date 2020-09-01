package com.decorator;

/**
 * @desc :ShapeDecorator 类的实体装饰类
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);//新增添加边框职责
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}

