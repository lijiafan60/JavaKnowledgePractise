package com.ljf.javaknowledgepractise.singleton;

/**
 * 懒汉式
 * 用到才构造
 * 多线程不安全
 */
public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    private SingletonLazy() {}

    public static SingletonLazy getSingletonLazy() {
        if(singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
