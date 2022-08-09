package com.jack.java.day07.v2;

/*
实现类：医生
 */
public class Docker extends Worker {
    @Override
    public void work() {
        System.out.println("看病！！");
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
