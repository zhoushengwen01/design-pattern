package com.strategy;

/**
 * @desc : 乘法策略
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
