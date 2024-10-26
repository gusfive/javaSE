package Qa_MapFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFramework {
    public static void main(String[] args) {
        /**Map:双列集合，格式为{key1 = value1,key2 = value2,...},一次需要存一对数据作为一个元素。
         *      Map集合的每个元素怒”key=value“称为一个键值对/键值对对象/一个Entry对象，Map集合也被叫做”键值对集合“
         *      Map集合的所有键是不允许重复的，但值可以重复，键和值是一一对应的，每一个键只能找到自己对应的值。
         *      Map<K,V>: HashMap<K,V>: LinkedHashMap<K,V>
         *                TreeMap<K,V>
         *      注意：Map系列集合的特点都是由键决定的，值只是一个附属品，值是不做要求的。
         *          HashMap（由键决定特点)：无序、不重复、无索引；（用的最多）
         *              LinkedHashMap:有序、不重复、无索引
         *          TreeMap:按照大小默认升序排序、不重复、无索引
         */
        //Map<String,Integer> map = new HashMap<>();//无序
        Map<String,Integer> map = new LinkedHashMap<>();//有序
        map.put("gs",999);//put增
        map.put("gs",0);//后面的数据会覆盖前面的数据
        map.put("wqr",61);
        map.put("gaoshou",1);
        System.out.println(map);

        Map<Integer,String> map1 = new TreeMap<>(((o1, o2) -> o2 - o1));//可排序
        map1.put(23,"wqr");
        map1.put(23,"qr");
        map1.put(0,"gaoshou");
        map1.put(99,"gs");
        System.out.println(map1);

    }
}
