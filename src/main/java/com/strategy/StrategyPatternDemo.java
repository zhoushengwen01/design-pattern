package com.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        //加
        Calculator calculator = new Calculator(new OperationAdd());
        int result1 = calculator.getResult(1, 2);
        System.out.println(result1);

        //减
        calculator = new Calculator(new OperationSubtract());
        int result2 = calculator.getResult(5, 1);
        System.out.println(result2);

        //乘
        calculator = new Calculator(new OperationMultiply());
        int result3 = calculator.getResult(3, 4);
        System.out.println(result3);


    }
}
