package com.cherry.factory.human;

/**
 * @Author WuRui
 * @ClassName HumanFactory
 * @Date 2021/4/28 14:23
 * @Version 1.0
 * @Description //TODO
 **/
public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        // 生成一个人种
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            // 异常处理
        }
        return (T)human;
    }
}
