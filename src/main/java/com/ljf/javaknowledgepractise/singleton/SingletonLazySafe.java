package com.ljf.javaknowledgepractise.singleton;

/**
 * 多线程下安全的懒汉式
 * 性能不高
 */
public class SingletonLazySafe {
    private static SingletonLazySafe singletonLazySafe;

    private SingletonLazySafe() {}

    public static synchronized SingletonLazySafe getSingletonLazySafe() {
        if(singletonLazySafe == null) {
            singletonLazySafe = new SingletonLazySafe();
        }
        return singletonLazySafe;
    }
}
