package main.java.com.syl.design.strategy.tankfire;

public class NormalFire extends FireOperator{

    @Override
    public void fireOperation() {
        setI(2);
        System.out.println("normal fire go go go");
    }
}
