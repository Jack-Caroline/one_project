package com.jack.java.day06;
/*
继承父类 Iphone4s
 */
public class Iphone5 extends Iphone4s {
    public static String brand = "iphone 5";

    public static void main(String[] args){
        Iphone5 iphone5 = new Iphone5();
        iphone5.sendMessage(brand);
    }
}
