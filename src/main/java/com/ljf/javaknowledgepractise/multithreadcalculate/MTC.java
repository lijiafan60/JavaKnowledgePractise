package com.ljf.javaknowledgepractise.multithreadcalculate;

import java.util.concurrent.atomic.AtomicInteger;

public class MTC implements Runnable{
    volatile int partition;
    volatile int sum;
    volatile int threadNumber;

    MTC() {
        partition = 0;
        sum = 0;
        threadNumber = 0;
    }

    public int getSum() {
        return sum;
    }
    public int getThreadNumber() {
        return threadNumber;
    }
    public synchronized void finish() {
        threadNumber--;
    }
    public synchronized void add(int tmpSum) {
        System.out.println("--- : " + partition);
        sum += tmpSum;
    }
    public synchronized int start() {
        partition++;
        threadNumber++;
        return partition;
    }
    @Override
    public void run() {
        int begin = (start() -1) * 1000 + 1;
        int end = begin + 1000;
        int tSum = 0;
        for(int i=begin;i<end;i++) tSum += i;
        add(tSum);
        finish();
    }
}
