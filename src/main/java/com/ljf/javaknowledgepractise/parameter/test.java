package com.ljf.javaknowledgepractise.parameter;

public class test {

    static void swap(Student stu1,Student stu2) {
        System.out.println(stu1.hashCode() + " ; " + stu2.hashCode());
        Student tmp = stu1;
        stu1 = stu2;
        stu2 = tmp;
        System.out.println(stu1.hashCode() + " ; " + stu2.hashCode() + " ; " + tmp.hashCode());
        System.out.println(stu1.getName() + " ; " + stu2.getName());
    }
    static void change(Student stu) {
        System.out.println(stu.hashCode());
        stu.setAge(100);
        System.out.println(stu.hashCode());
    }
    public static void main(String[] args) {
        Student xiaoMing = new Student("小明",15,"北京");
        Student xiaoGang = new Student("小刚",20,"南京");
        System.out.println(xiaoMing.hashCode() + " ; " + xiaoGang.hashCode());
        swap(xiaoMing,xiaoGang);
        System.out.println(xiaoMing + " ; " + xiaoGang);
        System.out.println("------");
        change(xiaoMing);
        System.out.println(xiaoMing.getAge());
    }
}
