package com.builder.item.coldDrink;

import com.builder.item.Item;
import com.builder.packing.Bottle;
import com.builder.packing.Packing;

/**
 * @desc : 冷饮
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

