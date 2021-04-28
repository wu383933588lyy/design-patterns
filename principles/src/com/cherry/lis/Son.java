package com.cherry.lis;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author WuRui
 * @ClassName Son
 * @Date 2021/4/25 16:02
 * @Version 1.0
 * @Description //TODO
 **/
public class Son extends Father implements Base{

    public Collection doSomething(HashMap map){
        System.out.println("======Son========");
        return map.values();
    }
}
