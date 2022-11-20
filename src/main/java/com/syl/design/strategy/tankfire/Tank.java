package main.java.com.syl.design.strategy.tankfire;

import java.util.TreeMap;

public class Tank {

    //容量
    private int capacity = 10;

    private final FireOperator fireOperator;

    public Tank() {
        fireOperator = null;
    }

    public Tank(FireOperator fireOperator){
        this.fireOperator = fireOperator;
    }

    public void fire(){
        if (fireOperator == null){
            System.out.println("没有火力！");
            return;
        }
        if (capacity > fireOperator.getI()){
            fireOperator.fireOperation();
            capacity -= fireOperator.getI();
        }else {
            System.out.println("火力不足");
        }
    }
}
