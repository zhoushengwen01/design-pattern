package com.builder.item.burger;

/**
 * @desc : 素汉堡
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
