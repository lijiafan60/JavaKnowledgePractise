package com.ljf.javaknowledgepractise.dynamicproxy.CGLIB;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object ans = methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return ans;
    }
}
