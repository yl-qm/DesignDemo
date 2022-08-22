package main.java.com.syl.design.singleton;

public class Singleton {
    private Singleton(){

    }

    private static Singleton INSTANCE = new Singleton();

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
