package com.jack.java.day06;

public class DuotaiDemoV2 {
    // 输出所有 Iphone 手机品牌信息
    public void showMobileBrand(Mobile mobile){
        mobile.brand();
    }

    public static void main(String[] args){
        DuotaiDemoV2 duotaiDemo = new DuotaiDemoV2();
        // 想知道 Iphone4s 的品牌信息
        Iphone4s iphone4s = new Iphone4s();
        duotaiDemo.showMobileBrand(iphone4s);
        // 想知道 Iphone4s 的品牌信息
        Iphone5 iphone5 = new Iphone5();
        duotaiDemo.showMobileBrand(iphone5);
    }
}
