package com.jack.java.day07.v2;

/*
 工人抽象类（劳动者抽象类）
 */
public abstract class Worker {
    // 工作方法（定义一个抽象方法）
    public abstract void work();

    // 显示一天工作日常
    public void showDairly() {
        System.out.println("起床！");
        System.out.println("上班！");
        work();
        System.out.println("下班！");
        System.out.println("睡觉！");
    }
}
