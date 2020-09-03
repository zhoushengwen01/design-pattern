package com.visitor;

/**
 * @desc : 键盘
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
