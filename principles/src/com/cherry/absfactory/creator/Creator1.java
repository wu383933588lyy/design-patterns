package com.cherry.absfactory.creator;

import com.cherry.absfactory.product.AbstractProductA;
import com.cherry.absfactory.product.AbstractProductB;
import com.cherry.absfactory.product.ProductA1;
import com.cherry.absfactory.product.ProductB1;

/**
 * @Author WuRui
 * @ClassName Creator1
 * @Date 2021/4/29 10:16
 * @Version 1.0
 * @Description //TODO
 **/
public class Creator1 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
