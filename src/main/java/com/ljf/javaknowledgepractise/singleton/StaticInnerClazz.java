package com.ljf.javaknowledgepractise.singleton;

/**
 * 懒汉式升级2.1
 * 使用静态内部类加载单例
 * Java 加载外部类的时候，不会创建内部类的实例，只有在外部类使用到内部类的时候才会创建内部类实例。
 */
public class StaticInnerClazz {

    private static class SingletonInner {
        private static final Instance instance = new Instance();
    }

    public static Instance getInstance() {
        return SingletonInner.instance;
    }
}
