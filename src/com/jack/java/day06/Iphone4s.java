package com.jack.java.day06;

public class Iphone4s extends Mobile {
    public String brand = "iphone 4s";

    public void passWordUnlock(String br) {
        System.out.println(br + " 手机密码解锁！！");
    }

    public void brand() {
        System.out.println(this.brand);
    }

    public static void main(String[] args) {
        Mobile iphone4s = new Iphone4s();     // 对象类型向上提升
        Iphone4s iphone4s2 = (Iphone4s) iphone4s;    //向下类型强制转换
        iphone4s2.brand();
    }

}
