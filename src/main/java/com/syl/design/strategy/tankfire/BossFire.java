package main.java.com.syl.design.strategy.tankfire;

public class BossFire extends FireOperator{
    @Override
    public void fireOperation() {
        setI(3);
        System.out.println("Boss fire go go go");
    }
}
