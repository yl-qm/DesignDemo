package main.java.com.syl.design.strategy.tankfire;

public class Tank {

    //容量
    private int capacity = 10;

    public void fire(FireOperator fireOperator){
        if (capacity > fireOperator.getI()){
            fireOperator.fireOperation();
            capacity -= fireOperator.getI();
        }else {
            System.out.println("火力不足");
        }
    }
}
