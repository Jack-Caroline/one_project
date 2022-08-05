package com.jack.java.day03;

public class ForDemo {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            num += i;
        }
        System.out.println(num);

        String[] names = {"aa", "bb", "cc"};
        //增强 for 循环
        for (String name : names) {
            System.out.println(name);
        }
    }
}
