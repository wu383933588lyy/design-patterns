package com.cherry.factory.human;

/**
 * @Author WuRui
 * @ClassName BlackHuman
 * @Date 2021/4/28 14:17
 * @Version 1.0
 * @Description //TODO
 **/
public class BlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黑色的人种是黑色的皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种说话一般听不懂");
    }
}
