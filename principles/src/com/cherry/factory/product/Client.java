package com.cherry.factory.product;

/**
 * @Author WuRui
 * @ClassName Client
 * @Date 2021/4/28 11:17
 * @Version 1.0
 * @Description //TODO
 **/
public class Client {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        ConcreteProduct1 product = factory.createProduct(ConcreteProduct1.class);
        product.method2();
    }
}
