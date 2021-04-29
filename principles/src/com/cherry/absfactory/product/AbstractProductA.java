package com.cherry.absfactory.product;

/**
 * @Author WuRui
 * @ClassName AbstractProductA
 * @Date 2021/4/29 9:48
 * @Version 1.0
 * @Description //TODO
 **/
public abstract class AbstractProductA {

    // 产品A 的共有方法
    public void shareMethod(){};

    // 产品的不同实现
    public abstract void doSomething();
}
