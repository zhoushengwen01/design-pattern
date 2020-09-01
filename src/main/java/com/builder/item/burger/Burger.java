package com.builder.item.burger;

import com.builder.item.Item;
import com.builder.packing.Packing;
import com.builder.packing.Wrapper;

/**
 * @desc : 汉堡
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

