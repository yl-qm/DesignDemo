package com.syl.design.decorator;

public class Coffee extends Drink{

    // 如果不用这个方法 直接用Drink继承就好
    @Override
    public int cost() {
        return super.getPrice();
    }
}
