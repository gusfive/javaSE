package Qa_MapFramework;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map遍历方式
        Map<String, Integer> map = new HashMap<>();
        map.put("gs",99);
        map.put("wqr",59);
        map.put("ymy",50);
        map.put("im",99);
        map.put("assassin",1);
        //1.键找值：先获取Map集合全部的键，再通过遍历键来找值
            //获取map集合的全部键
        Set<String> keys = map.keySet();
        System.out.println(keys);
            //遍历所有键，根据键获取对应的值
        for (String key : keys) {
            int value = map.get(key);
            System.out.println(key+":"+value);
        }

        //2.键值对：把键值对看成一个整体进行遍历
        System.out.println("----------");
        Set<Map.Entry<String,Integer>> entries = map.entrySet();//获取所有键值对的集合，返回Set<Map.Entry<K,V>>
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = map.get(key);
            System.out.println(key+":"+value);
        }

        //3.Lambda
        System.out.println("----------");
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + ":" + integer);
//            }
//        });
        map.forEach((k,v) -> System.out.println(k+":"+v));
    }
}
