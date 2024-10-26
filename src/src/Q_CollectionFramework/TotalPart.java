package Q_CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TotalPart {
    public static void main(String[] args) {
//        集合的体系结构
//        Collection:单列集合，每个元素（数据）只包含一个值。
//        Collection<E>:List<E>(添加的元素是有序、可重复、有索引的):ArrayList<E>（有序、可重复、有索引的）
//                                                           LinkedList<E>
//                      Set<E>（无序，不重复，无索引）:HashSet<E>（无序不重复无索引）:LinkedHashSet<E>（有序不重复无索引）
//                                                                           TreeSet<E>（按照大小默认升序排序、不重复、无索引）
//        Map:双列集合，每个元素包含两个值（键值对）。

        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java2");
        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java2");
        System.out.println(set);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("java1");
        lhs.add("java2");
        lhs.add("java1");
        lhs.add("java2");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("java2");
        ts.add("java2");
        ts.add("java1");
        ts.add("java3");
        System.out.println(ts);
    }

}
