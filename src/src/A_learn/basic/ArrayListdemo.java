package A_learn.basic;

import java.util.ArrayList;

public class ArrayListdemo {
    public static void main(String[] args) {
        //用的最多、最常见的一种集合
        //构造器
        ArrayList al = new ArrayList();
        //增
        al.add(1);
        al.add("nb");
        al.add('s');
        //查
        System.out.println(al.get(2));
        System.out.println(al.size());
        //删
        al.remove(2);
        //改
        al.set(0,0);
        System.out.println(al.get(0));

    }
}
