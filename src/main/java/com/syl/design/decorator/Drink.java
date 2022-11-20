package com.syl.design.decorator;

public abstract class Drink {

    private int price;

    private String describe;

    public abstract int cost();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
