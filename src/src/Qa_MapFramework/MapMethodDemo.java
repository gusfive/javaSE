package Qa_MapFramework;

import java.util.HashMap;
import java.util.Map;

public class MapMethodDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("咖啡",60);
        map.put(null,null);
        map.put("糖",15);
        map.put("凉面",11);
        map.put("辣条",1);

        System.out.println(map.size());//获取集合大小

//        map.clear();//清空集合
//        System.out.println(map);

        System.out.println(map.isEmpty());//判断是否为空，返回布尔值

        System.out.println(map.get("糖"));//根据键获取对应值

        System.out.println(map.remove("辣条"));//根据键删除整个元素（删除键会返回键的值）；

        System.out.println(map.containsKey("凉面"));//判断是否包含某个键，返回布尔值

        System.out.println(map.containsValue(null));//判断是否包含某个值

        System.out.println(map.keySet());//获取Map集合的全部键,返回Set<K>(无序，不重复，无索引)

        System.out.println(map.values());//获取Map集合的全部值，返回Collection<V>（可重复）

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("java1",10);
        map1.put("java2",20);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("java3",3434);
        map2.put("java4",3434);
        map1.putAll(map2);//putAll:把集合2元素全部倒入集合1中
        System.out.println(map1);
        System.out.println(map2);
    }
}
