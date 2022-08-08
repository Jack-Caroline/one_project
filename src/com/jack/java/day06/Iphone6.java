package com.jack.java.day06;

/*
继承父类 Iphone4s
 */
public class Iphone6 extends Iphone5s {
    public static String brand = "iphone 6";

    public static void main(String[] args) {
        Iphone6 iphone6 = new Iphone6();
        iphone6.sendMessage(brand);
    }
}
