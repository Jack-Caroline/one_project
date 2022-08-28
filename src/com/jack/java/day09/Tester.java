package com.jack.java.day09;

public class Tester extends Parent{
    static { // 完成数据的初始化
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        Student student1 = new Student("张三", 25, "男");
        Student student2 = new Student("李四", 26, "女");
        System.out.println(student1);
        System.out.println(student2);
        Tester.sayHi2();   // 静态方法可以通过类名直接调用
        Tester tester = new Tester();
        tester.sayHi();   // 非静态方法，需要创建对象后调用；

    }

    public Tester() {
        System.out.println("Tester.Tester()");
    }

    public void sayHi() {
        System.out.println("Tester.sayHi()");
    }

    public static void sayHi2() {
        System.out.println("Tester.sayHi2()");
    }
}
