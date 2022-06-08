package com.ljf.javaknowledgepractise.singleton;

/**
 * 饿汉式
 * 在加载类的时候就直接创建好
 */
public class SingletonHungry {

    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry() {}

    public static SingletonHungry getSingletonHungry() {
        return singletonHungry;
    }
}
