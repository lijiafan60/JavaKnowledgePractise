package com.ljf.javaknowledgepractise.stringtest;

public class test {
    public static void main(String[] args) {
        String a = "1";
        String b = new String(a + "2");
        b.intern();
        String c = "12";
        System.out.println(b == c);

        String aa = "a";
        String bb = new String(aa + "b");
        bb.intern();
        String cc = "ab";
        System.out.println(bb == cc);
    }
}
