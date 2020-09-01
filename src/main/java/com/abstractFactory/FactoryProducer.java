package com.abstractFactory;

/**
 * @desc : 工厂创造器
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}

