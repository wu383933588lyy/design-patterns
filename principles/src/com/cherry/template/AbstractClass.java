package com.cherry.template;

/**
 * @Author WuRui
 * @ClassName AbstractClass
 * @Date 2021/4/29 15:37
 * @Version 1.0
 * @Description //TODO
 **/
public abstract class AbstractClass {

    // 基本方法
    protected abstract void doSomething();

    // 模板方法
    public void templateMethod(){
        // 调用基本方法，完成相关逻辑
        this.doSomething();
    }
}
