package com.ljf.javaknowledgepractise.aoptest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SendImpl implements Send{
    public List<String> list = new ArrayList<>();

    @Override
    public void saveMessage(String msg) {
        list.add(msg);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("原方法：" + msg);
    }

    @Override
    public void showMessage() {
        System.out.println("----000----");
        list.forEach(System.out::println);
        System.out.println("----000----");
    }


}
