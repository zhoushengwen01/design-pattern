package com.abstractFactory;


import com.abstractFactory.colors.Color;
import com.abstractFactory.shaps.Shape;

/**
 * @desc : 抽象工厂
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public abstract class AbstractFactory {

    public abstract Color getColor(String color);//获得颜色

    public abstract Shape getShape(String shape);//获得形状
}
