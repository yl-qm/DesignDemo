package com.syl.design.decorator;

public class Ice extends DrinkDecorator{
    public Ice(Drink drink) {
        super(drink);
        setPrice(2);
        setDescribe("冰");
    }
}
