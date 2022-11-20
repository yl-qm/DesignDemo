package main.java.com.syl.design.strategy.tankfire;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank(new NormalFire());
        Tank tank1 = new Tank(new BossFire());
        Tank tank2 = new Tank();
        tank.fire();
        tank.fire();
        tank.fire();
        tank1.fire();
        tank1.fire();
        tank1.fire();
        tank1.fire();
        tank1.fire();
        tank2.fire();
    }
}

