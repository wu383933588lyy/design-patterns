package com.cherry.factory.human;

/**
 * @Author WuRui
 * @ClassName WhiteHuman
 * @Date 2021/4/28 14:20
 * @Version 1.0
 * @Description //TODO
 **/
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色的人种是白色的皮肤");
    }

    @Override
    public void talk() {
        System.out.println("白色人种说话一般是单字节");
    }
}
