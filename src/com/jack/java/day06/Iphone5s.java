package com.jack.java.day06;

/*
继承父类 Iphone4s
 */
public class Iphone5s extends Iphone5 {
    public static String brand = "iphone 5s";

    public static void main(String[] args) {
        Iphone5s iphone5s = new Iphone5s();
        iphone5s.sendMessage(brand);
    }
}
