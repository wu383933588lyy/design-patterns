package com.cherry.lis;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author WuRui
 * @ClassName Liskov
 * @Date 2021/4/25 16:00
 * @Version 1.0
 * @Description //TODO
 **/
public class LiskovClient {

    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        Son son = new Son();
        son.doSomething(map);
    }
}
