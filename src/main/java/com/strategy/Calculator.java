package com.strategy;

/**
 * @desc : 计算器
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Calculator {
    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
