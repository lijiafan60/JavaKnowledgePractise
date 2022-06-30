package com.ljf.javaknowledgepractise.multithreadcalculate;


import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    // 1 + ..... + 1000000;
    public static MTC mtc;
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        mtc = new MTC();
        System.out.println(dateFormat.format(new Date()));
        for(int i=1;i<=10;i++) {
            new Thread(mtc).start();
        }
        while(mtc.getThreadNumber() != 0) {
            System.out.println(mtc.getThreadNumber());
            Thread.sleep(100);
        }
        System.out.println(dateFormat.format(new Date()));
        System.out.println(mtc.getSum());
        System.out.println("------");
        System.out.println(dateFormat.format(new Date()));
        int sum = 0;
        for(int i=1;i<=10000;i++) {
            sum += i;
        }
        System.out.println(dateFormat.format(new Date()));
        System.out.println(sum);
    }
}
