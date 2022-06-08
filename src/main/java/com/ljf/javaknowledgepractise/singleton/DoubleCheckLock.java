package com.ljf.javaknowledgepractise.singleton;

/**
 * 双重检测锁
 * 懒汉式升级版本2.0
 * 不在方法上加synchronized，防止频繁竞争锁
 * 需要声明instance为volatile，防止指令重排
 * 正常的new对象的过程为：申请空间->初始化->将instance指向申请到的地址
 * 多线程下有可能被指令重排序为：申请空间->将instance指向申请到的地址->初始化
 * 这样有可能会导致拿到的instance没有初始化
 */
public class DoubleCheckLock {

    private static volatile Instance instance;

    public Instance getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckLock.class) {
                if(instance == null) {
                    instance = new Instance();
                }
            }
        }
        return instance;
    }
}
