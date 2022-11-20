package com.syl.design.decorator;

public class DrinkDecorator extends Drink{

    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public int cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescribe() {
        // drink.getDescribe() 会无限递归寻找内部的drink
        return super.getDescribe() + drink.getDescribe();
    }
}
