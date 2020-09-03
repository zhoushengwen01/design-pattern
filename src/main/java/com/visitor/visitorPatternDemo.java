package com.visitor;


public class visitorPatternDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new NormalComputerPartVisitor());
        computer.accept(new VIPComputerPartVisitor());
    }
}
