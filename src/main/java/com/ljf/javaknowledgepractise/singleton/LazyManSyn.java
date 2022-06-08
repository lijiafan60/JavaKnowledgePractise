package com.ljf.javaknowledgepractise.singleton;

/**
 * 懒汉式升级版本1.0
 * 对getInstance加上synchronized，解决并发问题
 * 但是多线程下竞争锁会带来性能影响
 */
public class LazyManSyn {

    private static Instance instance;

    public synchronized Instance getInstance() {
        if(instance == null) {
            instance = new Instance();
        }
        return instance;
    }
}
