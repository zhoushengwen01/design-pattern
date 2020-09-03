package com.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc : 股票经纪人
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    //添加任务命令
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    //下单
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
