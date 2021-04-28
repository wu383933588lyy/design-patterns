package com.cherry.lis;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author WuRui
 * @ClassName Father
 * @Date 2021/4/25 16:01
 * @Version 1.0
 * @Description //TODO
 **/
public class Father {

    public Collection doSomething(Map map){
        System.out.println("======Father========");
        return map.values();
    }
}
