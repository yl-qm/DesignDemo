package main.java.com.syl.design.strategy.tankfire;


public abstract class FireOperator {
    private int i;

    public abstract void fireOperation();

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
