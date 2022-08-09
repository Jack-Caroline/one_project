package com.jack.java.day07.v2;

/*
厨师
 */
public class Cooker extends Worker {

    @Override
    public void work() {
        System.out.println("烹饪");
    }

    // 显示一天工作日常
//    public void showDairly() {
//        System.out.println("起床！");
//        System.out.println("上班！");
//        work();
//        System.out.println("下班！");
//        System.out.println("睡觉！");
//    }
}
