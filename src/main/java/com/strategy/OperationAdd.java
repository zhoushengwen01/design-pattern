package com.strategy;

/**
 * @desc : 加法策略
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
