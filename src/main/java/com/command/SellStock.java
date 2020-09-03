package com.command;

/**
 * @desc : 抛售股票命令
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}

