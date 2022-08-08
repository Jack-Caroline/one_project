package com.jack.java.day06;

public class Iphone4s extends Mobile {
    public String brand = "iphone 4s";

    public void passWordUnlock(String br) {
        System.out.println(br + " 手机密码解锁！！");
    }
    public void brand() {
        System.out.println(this.brand);
    }

}
