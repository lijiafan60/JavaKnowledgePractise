package com.ljf.javaknowledgepractise.dynamicproxy;

import com.ljf.javaknowledgepractise.dynamicproxy.CGLIB.MyInterceptor;
import com.ljf.javaknowledgepractise.dynamicproxy.JDK.MyInvocationHandler;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class Test {
    private static Hello hello = new HelloImpl();

    static Hello getProxy() {
        return (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(),new MyInvocationHandler(hello)) ;
    }
    static Hello getCglibProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(hello.getClass().getClassLoader());
        enhancer.setCallback(new MyInterceptor());
        enhancer.setSuperclass(hello.getClass());
        return (Hello) enhancer.create();
    }
    public static void main(String[] args) {
        System.out.println(hello);
        Hello test = getProxy();
        Hello test1 = getCglibProxy();
        System.out.println("? " + test);
        System.out.println("? " + test1);
        test.hello();
        System.out.println("----");
        test1.hello();
    }
}
