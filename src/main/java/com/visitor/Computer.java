package com.visitor;

/**
 * @desc : 电脑
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Keyboard(), new Monitor(), new Mouser()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
