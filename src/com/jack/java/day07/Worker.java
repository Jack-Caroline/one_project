package com.jack.java.day07;

/*
劳动者
 */
public interface Worker {
    // 工作：抽象的方法（未实现的方法）
    public abstract void work();

    // 常量（无法改变的）
    public static final String title = "工人";
}
