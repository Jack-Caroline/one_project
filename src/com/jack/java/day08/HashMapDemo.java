package com.jack.java.day08;

import java.util.HashMap;
import java.util.Map.*;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
//        System.out.println(map.size());
        map.put("name", "名扬");
        map.put("age", "18");
//        System.out.println(map.get("name"));
//        map.remove("name");
//        System.out.println(map.get("name"));
//        System.out.println(map.size());
//        System.out.println(map.containsKey("name"));
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println("key=" + key);
//        }
//        Collection<String> collection = map.values();
//        for (String value : collection) {
//            System.out.println(value);
//        }
        // 迭代，遍历map：依次拿出 map 中的所有键值对
//        Set<String> keys = map.keySet();
//        for (String key:keys){
//            String value = map.get(key);
//            System.out.println("key:"+key+",value:"+value);
//        }
        Set<Entry<String, String>> entries = map.entrySet();
        for (Entry<String, String> entry : entries) {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }
    }
}
