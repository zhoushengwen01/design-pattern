package com.visitor;

/**
 * @desc : 电脑访问者接口
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouser mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
