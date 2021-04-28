package com.cherry.factory.human;

/**
 * @Author WuRui
 * @ClassName AbstractHumanFactory
 * @Date 2021/4/28 14:21
 * @Version 1.0
 * @Description //TODO
 **/
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
