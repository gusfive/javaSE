package Q_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //Collection的遍历方式

        Collection<String> c = new ArrayList<>();
        c.add("gs");
        c.add("wqr");
        c.add("nb");
        c.add("666");
        System.out.println(c);

        //迭代器：迭代器是用来遍历集合的专用方式（数组没有迭代器），在JAVA中迭代器的代表是Iterator。
        //1.从集合对象中获取迭代器对象，默认指向当前集合的第一个元素
        Iterator<String> it = c.iterator();
//        System.out.println(it.next());//获取当前位置的元素，并同时将迭代器对象指向下一个元素处。
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        //2.使用循环结合迭代器遍历集合
        while (it.hasNext()){  //hasNext询问当前位置是否有元素存在，存在返回true，不存在返回false
            System.out.println(it.next());//如果循环体里有两次next,可能会造成元素越界
        }

        System.out.println("---------------");
        //增强for循环:for(元素的数据类型 变量名：数组或者集合){}，可以用来遍历集合或者数组,本质上就是迭代器遍历集合的简化写法
        for(String s : c){
            System.out.println(s);
        }

        System.out.println("---------------");
        //Lambda表达式遍历集合：default void forEach(Consumer<? super T> action)
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        //c.forEach(s -> System.out.println(s));
        c.forEach(System.out::println);//实例方法的Lambda简化
    }
}
