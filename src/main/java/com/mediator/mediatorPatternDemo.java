package com.mediator;

public class mediatorPatternDemo {
    public static void main(String[] args) {
        User zhangsan = new User("张三");
        User lisi = new User("李四");

        zhangsan.talk("hi");
        lisi.talk("呵呵");
    }
}
