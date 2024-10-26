package Q_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        //List集合支持的遍历方式：for,迭代器，增强for循环,Lambda表达式
        List<String> l1 = new ArrayList<>();
        l1.add("gs");
        l1.add("wqr");
        l1.add("nb");
        l1.add("666");

        //1.for
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        //2.迭代器
        System.out.println("-----------");
        Iterator<String> it = l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //3.增强for循环
        System.out.println("-----------");
        for (String s : l1) {
            System.out.println(s);
        }

        //4.Lambda表达式
        System.out.println("----------");
        l1.forEach(System.out::println);
    }
}
