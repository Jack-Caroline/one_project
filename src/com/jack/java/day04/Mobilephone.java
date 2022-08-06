package com.jack.java.day04;
/*
构造函数的调用
 */
public class Mobilephone {
    //品牌
    public String brand;
    //产品类型
    public String generation;
    //价格
    public int price;

    public void SendMessage(String name) {
        System.out.println(name + ",晚上有空吗？一起吃饭");
        System.out.println("------词短信通过【" + this.brand + this.generation + "】手机发送！！！");
    }

    public Mobilephone() {

    }

    public Mobilephone(String brand, String generation, int price) {
        this.brand = brand;
        this.generation = generation;
        this.price = price;
    }

    public static void main(String[] args) {
        //用华为P20,价格：8888，给小明同学发条短信
        Mobilephone mobilephone = new Mobilephone("华为","p20",888);
        String name = "张某某";
        mobilephone.SendMessage(name);
    }
}
