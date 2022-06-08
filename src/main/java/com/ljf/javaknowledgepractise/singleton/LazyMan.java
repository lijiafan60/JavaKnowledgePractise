package com.ljf.javaknowledgepractise.singleton;

/**
 * 懒汉式
 * 在用到的时候才创建
 * 因为new一个对象 不是原子性操作，所以多线程下会存在问题
 */
public class LazyMan {

    private static Instance instance;

    public Instance getInstance() {
        if(instance == null) {
            instance = new Instance();
        }
        return instance;
    }
}
