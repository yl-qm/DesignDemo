package com.syl.design.decorator;

public class Main {
    public static void main(String[] args) {
        Drink order = new LongBlack();

        System.out.println(order.cost());
        System.out.println(order.getDescribe());

        order = new Ice(order);

        System.out.println(order.cost());
        System.out.println(order.getDescribe());

        order = new Chocolate(order);

        System.out.println(order.cost());
        System.out.println(order.getDescribe());

        // 层级关系为：
        //     Drink:
        //         Drink:
        //              Drink:
        // 每加一层就意味着在外面包了一层Drink

    }
}
