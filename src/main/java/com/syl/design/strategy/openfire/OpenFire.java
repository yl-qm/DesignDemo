package main.java.com.syl.design.strategy.openfire;

import main.java.com.syl.design.strategy.tankfire.FireOperator;

public class OpenFire<T> {

    public <T extends CanFire> void fire(T t, FireOperator fireOperator){
        if (t.total > fireOperator.getI()){
            fireOperator.fireOperation();
        }else {
            System.out.println("弹药耗尽");
        }
    }
}
