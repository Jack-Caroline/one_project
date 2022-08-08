package com.jack.java.day06;

public class DuotaiDemo {
    // 输出 Iphone4s 手机品牌信息
    public void showIphone4sBrand(Iphone4s iphone4s) {
        iphone4s.brand();
    }
    // 输出 Iphone4s 手机品牌信息
    public void showIphone5Brand(Iphone5 iphone5) {
        iphone5.brand();
    }
    // 输出 Iphone4s 手机品牌信息
    public void showIphone5sBrand(Iphone5s iphone5s) {
        iphone5s.brand();
    }
    // 输出 Iphone6 手机品牌信息
    public void showIphone6Brand(Iphone6 iphone6) {
        iphone6.brand();
    }
    public static void main(String[] args){
        DuotaiDemo duotaiDemo = new DuotaiDemo();
        // 想知道 Iphone4s 的品牌信息
        Iphone4s iphone4s = new Iphone4s();
        duotaiDemo.showIphone4sBrand(iphone4s);
        // 想知道 Iphone4s 的品牌信息
        Iphone5 iphone5 = new Iphone5();
        duotaiDemo.showIphone5Brand(iphone5);
    }
}
