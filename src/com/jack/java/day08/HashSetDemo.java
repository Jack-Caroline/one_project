package com.jack.java.day08;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        int a = set.size();
        System.out.println(a);
        System.out.println(set.isEmpty());
        set.add("张三");
        set.add("李四");
        set.add("王五");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("wangwu"));
//        set.remove("王五");
//        Object[] objects = set.toArray(); //先转化为数组
//        for (Object object : objects) {
//            System.out.println(object);
//        }
//        set.clear();
//        System.out.println(set.size());
        // 迭代（遍历）set 集合
        Iterator<String> ite = set.iterator(); // 获取迭代器
        while(ite.hasNext()){  // 判断是否有下一个数据
            System.out.println(ite.next());  // 取出数据
        };

        // 遍历集合，遍历时不可删除数据
        for (String name:set){
            System.out.println(name);
        }
    }
}
