package com.visitor;

/**
 * @desc : 显示器
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class Mouser implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
