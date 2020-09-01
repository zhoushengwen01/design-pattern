package com.builder.item;

import com.builder.packing.Packing;

/**
 * @desc :食物条目
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public interface Item {
    String name(); //名称

    Packing packing();//包装

    float price();//价格
}
