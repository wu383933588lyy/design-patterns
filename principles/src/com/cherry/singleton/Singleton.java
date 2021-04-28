package com.cherry.singleton;

/**
 * @Author WuRui
 * @ClassName Singleton
 * @Date 2021/4/27 10:18
 * @Version 1.0
 * @Description //TODO
 **/
public class Singleton {

    private static final Singleton singlton = new Singleton();

    public Singleton() {
    }

    public static Singleton getInstance(){
        return singlton;
    }
}
