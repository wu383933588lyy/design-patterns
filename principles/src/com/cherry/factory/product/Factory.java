package com.cherry.factory.product;

/**
 * @Author WuRui
 * @ClassName Creator
 * @Date 2021/4/28 11:13
 * @Version 1.0
 * @Description //TODO
 **/
public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> c);
}
