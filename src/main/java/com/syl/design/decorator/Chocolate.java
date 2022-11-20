package com.syl.design.decorator;

public class Chocolate extends DrinkDecorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDescribe("巧克力");
        setPrice(5);
    }
}
