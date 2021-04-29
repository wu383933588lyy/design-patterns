package com.cherry.absfactory;

import com.cherry.absfactory.creator.AbstractCreator;
import com.cherry.absfactory.creator.Creator1;
import com.cherry.absfactory.product.AbstractProductA;
import com.cherry.absfactory.product.AbstractProductB;

/**
 * @Author WuRui
 * @ClassName Client
 * @Date 2021/4/29 10:18
 * @Version 1.0
 * @Description //TODO
 **/
public class Client {

    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractProductA a1 = creator1.createProductA();
        AbstractProductB b1 = creator1.createProductB();
        a1.doSomething();
        b1.doSomething();
    }
}
