package com.jack.java.day08;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        int a = list.size();
        System.out.println(a);
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list.size());
        System.out.println(list.get(0));
        String removeString = list.remove(0);
        System.out.println(removeString);
        boolean isSuccess =list.remove("王五");
        System.out.println(isSuccess);
        System.out.println(list.contains("lk"));
        list.set(2,"林九");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
