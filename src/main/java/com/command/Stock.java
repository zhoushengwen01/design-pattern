package com.command;

/**
 * @desc : 股票
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/
public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + "] sold");
    }
}

