package main.java.com.syl.design.strategy.tankfire;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.fire(new NormalFire());
        tank.fire(new NormalFire());
        tank.fire(new NormalFire());
        tank.fire(new NormalFire());
        tank.fire(new BossFire());
        tank.fire(new BossFire());
    }
}

