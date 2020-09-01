package com.builder.item.burger;

/**
 * @desc : 炸鸡汉堡
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

