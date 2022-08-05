package com.jack.java.day04;

/*

 */
public class Mobile {
    //品牌
    public String brand;
    //价格
    public int price;

    //发送短信
    public void sendMessage(String name) {
        System.out.println(name + "，你在家吗？我周末可以不可以去你家玩");
    }

    //返回手机的价格和品牌信息
    public String getMobileInfo() {
        return "手机品牌：" + this.brand + "，手机价格：" + this.price;
    }
    //无参构造函数，作用：创造一个最原始的对象；
    public Mobile() {

    }

    //带参数构造函数，作用：能够按照我们的意愿来初始化一个对象
    public Mobile(String name, int money) {
        this.brand = name;
        this.price = money;
    }

    public static void main(String[] args) {
        //通过调用无参构造函数，创建一个原始对象
        Mobile mobile1 = new Mobile();
        //调用带参构造函数，创建一个对象，品牌：华为，价格：888
        Mobile mobile2 = new Mobile("华为", 888);
        //显示手机1的品牌信息和价格；
        String info1 = mobile1.getMobileInfo();
        //显示手机2的品牌信息和价格；
        String info2 = mobile2.getMobileInfo();
        System.out.println(info1);
        System.out.println(info2);
    }
}
