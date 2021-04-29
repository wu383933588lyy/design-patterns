package com.cherry.template;

import com.cherry.absfactory.creator.AbstractCreator;

/**
 * @Author WuRui
 * @ClassName Client
 * @Date 2021/4/29 15:41
 * @Version 1.0
 * @Description //TODO
 **/
public class Client {

    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        class1.templateMethod();
        class2.templateMethod();
    }
}
