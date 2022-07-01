package com.ljf.javaknowledgepractise.multithreadprintab;

import lombok.SneakyThrows;

public class PrintABC {

    public static volatile char state;

    private static class Print implements Runnable{

        private final char printChar;

        private final char nextPrintChar;

        private int printNumber;

        private Object lock;

        Print(char printChar,char nextPrintChar,int printNumber,Object lock) {
            this.printChar = printChar;
            this.nextPrintChar = nextPrintChar;
            this.printNumber = printNumber;
            this.lock = lock;
        }

        @SneakyThrows
        @Override
        public void run() {
            synchronized (lock) {
                for(int i=0;i<printNumber;i++) {
                    while(state != printChar) {
                        lock.wait();
                    }
                    System.out.println(printChar);
                    state = nextPrintChar;
                    lock.notifyAll();
                }
            }
        }
    }
    public static void main(String[] args) {
        state = 'A';
        Object Lock = new Object();
        Print printA = new Print('A','B',5,Lock);
        Print printB = new Print('B','C',5,Lock);
        Print printC = new Print('C','A',5,Lock);
        new Thread(printA).start();
        new Thread(printB).start();
        new Thread(printC).start();
    }


}
