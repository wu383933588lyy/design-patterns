package com.cherry.absfactory.creator;

import com.cherry.absfactory.product.AbstractProductA;
import com.cherry.absfactory.product.AbstractProductB;

/**
 * @Author WuRui
 * @ClassName AbstractCreator
 * @Date 2021/4/29 10:14
 * @Version 1.0
 * @Description //TODO
 **/
public abstract class AbstractCreator {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
