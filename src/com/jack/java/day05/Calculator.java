package com.jack.java.day05;

import java.util.Scanner;

/*
计算器（作业）
1、实现计算器的加减乘除功能，并且支持数据的输出；
2、要导出可执行的 jar 包，通过 bat 批处理文件来运行程序；
 */
public class Calculator {
    //加
    public double add(double a, double b) {
        return a + b;
    }

    //减
    public double substract(double a, double b) {
        return a - b;
    }

    //乘
    public double multiply(double a, double b) {
        return a * b;
    }

    //除
    public double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
//        double a = 3;
//        double b = 4;
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(a, b));

        // Scanner，通过此类可以实现控制台数据输入
        // 要使用 Scanner 类创建扫描对象，首先要将此类引入（导入）当前的类，
        Scanner scanner = new Scanner(System.in);
        // 准备计算器对象
        Calculator calculator = new Calculator();
        // 输入第一个数据
        System.out.println("请输入第一个数据：");
        // 获取控制台输入的数据 a
        double a = scanner.nextDouble();
        // 输入运算符
        System.out.println("请输入运算符：");
        // 获取控制台输入的运算符 加减乘除
        String operator = scanner.next();
        // 输入第二个数据
        System.out.println("请输入第二个数据：");
        // 获取控制台输入的数据 b
        double b = scanner.nextDouble();
        double result = 0;
        // 根据输入的运算符，调用响应的方法完成数据运算
        if ("+".equals(operator)) {
            result = calculator.add(a, b);
        } else if ("-".equals(operator)) {
            result = calculator.substract(a, b);
        } else if ("*".equals(operator)) {
            result = calculator.multiply(a, b);
        } else if ("/".equals(operator)) {
            result = calculator.divide(a, b);
        } else {
            System.out.println("运算符输入错误，运算结束！！！");
        }
        // 输出结果
        System.out.println("结果为：" + result);
    }
}
