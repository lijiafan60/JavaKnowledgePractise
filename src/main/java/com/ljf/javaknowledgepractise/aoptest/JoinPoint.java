package com.ljf.javaknowledgepractise.aoptest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JoinPoint {
    @Pointcut("execution(* com.ljf.javaknowledgepractise.aoptest.SendImpl.sendMessage(..))")
    public void sendMessageEnhance() {
    }
    @Pointcut("execution(* com.ljf.javaknowledgepractise.aoptest.SendImpl.sendMessage(..))")
    public void saveMessageEnhance() {

    }

    @Around("sendMessageEnhance()")
    public void AroundSendMessage(ProceedingJoinPoint jp) {
        System.out.println(this.hashCode() + ":  发送方法前");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(this.hashCode() + ":  发送方法后");
    }

    @Around("saveMessageEnhance()")
    public void AroundSaveMessage(ProceedingJoinPoint jp) {
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

//    @Before("methodEnhance()")
//    public void BeforeSendMessage() {
//        System.out.println(this + ": 发送方法前");
//    }

}
