package com.cherry.factory.human;

/**
 * @Author WuRui
 * @ClassName NvWa
 * @Date 2021/4/28 14:29
 * @Version 1.0
 * @Description //TODO
 **/
public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        YellowHuman human = factory.createHuman(YellowHuman.class);
        human.getColor();
        human.talk();
    }
}
