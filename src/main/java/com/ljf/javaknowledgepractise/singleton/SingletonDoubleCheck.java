package com.ljf.javaknowledgepractise.singleton;

/**
 * 双重检测锁
 */
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck singletonDoubleCheck;

    private SingletonDoubleCheck() {}

    public static SingletonDoubleCheck getSingletonDoubleCheck() {
        if(singletonDoubleCheck == null) {
            synchronized (SingletonDoubleCheck.class) {
                if(singletonDoubleCheck == null) {
                    singletonDoubleCheck = new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }
}
