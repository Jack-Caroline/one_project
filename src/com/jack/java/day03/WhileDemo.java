package com.jack.java.day03;

public class WhileDemo {
    public static void main(String[] args) {
        int x = -1;
        do {
            System.out.println(x);  // 输出-1到5
            x++;
        } while (x >= 0 && x <= 5);


        int y = -1;
        while(x >= 0 && x <= 5){
            System.out.println(x);  //无输出
            x++;
        }
    }
}
