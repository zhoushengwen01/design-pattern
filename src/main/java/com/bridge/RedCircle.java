package com.bridge;


/**
 * @desc : 红圆
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}

