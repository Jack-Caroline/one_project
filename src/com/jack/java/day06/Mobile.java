package com.jack.java.day06;

public class Mobile {
    public String brand = "未知手机";

    public void makeCall(String br) {
        System.out.println("通过 " + br + " 手机打电话！！");
    }

    public void sendMessage(String br) {
        System.out.println("通过 " + br + " 手机发短信！！");
    }

    public void brand() {
        System.out.println(this.brand);
    }
}
