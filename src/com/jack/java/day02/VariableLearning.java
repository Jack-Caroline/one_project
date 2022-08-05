package com.jack.java.day02;

public class VariableLearning {
    public static void main(String[] args) {
        //定义布尔类型的变量
        boolean aa = true;  // = 表示复制运算符
        //定义整型
        byte bb = 1;
        short cc = 2;
        int dd = 3;
        long ee = 4;
        // 浮点型
        float ff = (float) 3.23; // 小数默认被提升为了 double 类型（8个字节），这个过程叫类型自动向上提升，但是左边变量的类型声明的是 float ，因此大类型转化为小类型，必须要向下强制转换，此过程是需要手动强制完成；
        float ff1 = 3.23f;
        double gg = 2.36;
        // 字符型
        char hh = 'a';

        // 引用类型
        String name = "丁先生";
        // 字符串拼接
        int age = 24;
        System.out.println(name + age);
        //数组
        //一维数组
        int[] arr1 = new int[5];
        String[] names = {"张三", "李四", "王五"};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        // 二维数组
        String[][] names2 = {{"张三", "李四"}, {"赵六", "孙七"}, {"周八", "吴九"}};
        String[][] names3 = new String[4][3];  // 创建的二维数组，4行3列，数据是空值 null

        // 三目运算符 A?B:C ==》 A,B,C 依次为表达式，而且A是一个条件表达式，经过运算会得到一个 boolean 类型的值
        // 如果值为 true，就执行 B 表达式，否则就执行 C 表达式；
        int a = 3;
        int b = 4;
        System.out.println((a < b ? a++ : a--));
        System.out.println(a);

    }
}
