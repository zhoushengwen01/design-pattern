package com.builder;

import com.builder.item.burger.ChickenBurger;
import com.builder.item.burger.VegBurger;
import com.builder.item.coldDrink.Coke;
import com.builder.item.coldDrink.Pepsi;

/**
 * @desc : 套餐构建
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/

public class MealBuilder {

    //准备素食套餐
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }


    //准备非素食套餐
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

