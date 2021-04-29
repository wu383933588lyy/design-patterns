package com.cherry.absfactory.creator;

import com.cherry.absfactory.product.AbstractProductA;
import com.cherry.absfactory.product.AbstractProductB;
import com.cherry.absfactory.product.ProductA2;
import com.cherry.absfactory.product.ProductB2;

/**
 * @Author WuRui
 * @ClassName Creator2
 * @Date 2021/4/29 10:17
 * @Version 1.0
 * @Description //TODO
 **/
public class Creator2 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
