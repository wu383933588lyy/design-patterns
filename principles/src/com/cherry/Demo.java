package com.cherry;

/**
 * @Author WuRui
 * @ClassName Demo
 * @Date 2021/5/8 9:25
 * @Version 1.0
 * @Description //TODO
 **/
public class Demo {

    private int a;

    private static int b;

    private static final int c;

    private static final int d = 6;

    static {
        c = 5;
    }

    public int add(int e, int f) {
        return e + f;
    }

    public void test(String name) {
        System.out.println(name + "--name");
    }
}
