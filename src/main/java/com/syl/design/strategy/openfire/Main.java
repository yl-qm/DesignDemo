package main.java.com.syl.design.strategy.openfire;

import main.java.com.syl.design.strategy.tankfire.BossFire;
import main.java.com.syl.design.strategy.tankfire.NormalFire;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        AWM awm = new AWM();
        Gun gun = new Gun();
        OpenFire<AWM> awmOpenFire = new OpenFire<>();
        OpenFire<Gun> gunOpenFire = new OpenFire<>();
        awmOpenFire.fire(awm,new BossFire());
        awmOpenFire.fire(awm,new NormalFire());
        gunOpenFire.fire(gun,new NormalFire());
    }
}
