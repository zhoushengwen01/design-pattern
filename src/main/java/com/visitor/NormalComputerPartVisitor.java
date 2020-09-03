package com.visitor;

/**
 * @desc : 普通玩家
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class NormalComputerPartVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computerPart) {
        System.out.println("普通玩家访问电脑");
    }

    @Override
    public void visit(Mouser mouse) {
        System.out.println("普通玩家访问鼠标");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("普通玩家访问键盘");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("普通玩家访问显示器");
    }
}
