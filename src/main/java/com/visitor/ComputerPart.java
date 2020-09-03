package com.visitor;

/**
 * @desc :电脑相关器件接口
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
