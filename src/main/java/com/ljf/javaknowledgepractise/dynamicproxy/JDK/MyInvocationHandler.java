package com.ljf.javaknowledgepractise.dynamicproxy.JDK;

import com.ljf.javaknowledgepractise.dynamicproxy.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;
    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object ans = method.invoke(target,args);
        System.out.println("after");
        return ans;
    }
}
