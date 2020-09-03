package com.visitor;
/**
 * @desc : 显示器
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
