package Q_CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        /**特点：无序，即添加数据的顺序和获取出的数据顺序不一致；不重复；无索引
         *      HashSet:无序、不重复、无索引。
         *              LinkedHashSetL:有序、不重复、无索引。
         *      TreeSet:升序、不重复、无索引。
         *注意：Set的常用方法，基本上就是Collection提供的，自己几乎没有额外新增一些常用功能。
        */

        //Set<Integer> set = new HashSet<>();
        //Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(111);
        set.add(111);
        set.add(222);
        set.add(444);
        set.add(333);
        set.add(000);
        System.out.println(set);
    }
}
