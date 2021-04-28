package com.cherry.factory;

/**
 * @Author WuRui
 * @ClassName ConcreteFactory
 * @Date 2021/4/28 11:15
 * @Version 1.0
 * @Description //TODO
 **/
public class ConcreteFactory extends Factory{

    @Override
    public <T extends Product> T createProduct(Class<T> c) {

        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            // 异常处理
        }
        return (T)product;
    }
}
