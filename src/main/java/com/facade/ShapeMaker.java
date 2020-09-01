package com.facade;

/**
 * @desc : 形状创造者
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class ShapeMaker {
    private Shape rectangle;
    private Shape circle;

    public ShapeMaker() {
        rectangle = new Rectangle();
        circle = new Circle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }


}
