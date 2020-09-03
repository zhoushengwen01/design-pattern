package com.interpreter;

/**
 * @desc : 终端
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
