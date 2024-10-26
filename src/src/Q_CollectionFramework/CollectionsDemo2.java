package Q_CollectionFramework;

import java.util.*;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        //Collections是一个用来操作集合的工具类

       List<String> c1 = new ArrayList<>();
        c1.add("可叹");
        c1.add("落叶飘零");
        c1.add("破绽");
        c1.add("稍纵即逝");
        Collections.addAll(c1, "海上的风浪很大","打出极道神威","打出极道神威","盖世无敌的拳光！");//给集合批量添加元素
        System.out.println(c1);
        Collections.shuffle(c1);//打乱List集合中的元素顺序
        System.out.println(c1);
        Collections.sort(c1);//对List集合中的元素进行升序排序
        System.out.println(c1);
        Collections.sort(c1, ((o1, o2) -> o1.length() - o2.length()));//对List集合中元素，按照比较器对象指定的规则进行排序
        System.out.println(c1);
    }
}
