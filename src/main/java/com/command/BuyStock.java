package com.command;

/**
 * @desc : 购买股票命令
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}

