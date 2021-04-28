package com.cherry.factory.human;

/**
 * @Author WuRui
 * @ClassName YellowHuman
 * @Date 2021/4/28 14:20
 * @Version 1.0
 * @Description //TODO
 **/
public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄色的人种是黄色的皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话一般是双字节");
    }
}
