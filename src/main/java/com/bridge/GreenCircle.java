package com.bridge;


/**
 * @desc : 绿圆
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}

