package com.jack.java.day07.v2;

/*
实现类：老师
 */
public class Teacher extends Worker {
    @Override
    public void work() {
        System.out.println("教书！！");
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
