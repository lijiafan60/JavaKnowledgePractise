package com.ljf.javaknowledgepractise.singleton;

/**
 * 饿汉式
 * jvm加载类的时候直接创建实例
 */
public class HungryMan {

    private static Instance instance = new Instance();

    public Instance getInstance() {
        return instance;
    }
}
