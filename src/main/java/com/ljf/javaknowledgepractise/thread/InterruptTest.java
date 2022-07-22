package com.ljf.javaknowledgepractise.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterruptTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                if(Thread.currentThread().isInterrupted()) {
                } else {
                    System.out.println("i = " + i);
                }
            }
        });
        t1.start();
        try {
            t1.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("???");
            e.printStackTrace();
            t1.interrupt();
        }
        t1.interrupt();
        System.out.println(t1.isInterrupted());
    }
}
