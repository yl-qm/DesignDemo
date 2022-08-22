package main.java.com.syl.design.singleton;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton.getInstance().hashCode());
            }).start();
        }
    }
}
