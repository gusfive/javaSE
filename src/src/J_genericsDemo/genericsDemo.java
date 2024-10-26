package J_genericsDemo;

import java.util.ArrayList;

public class genericsDemo {
    public static void main(String[] args) {
        //定义类、接口、方法时，同时声明一个或者多个类型变量（如：<E>），称为泛型类、泛型接口，泛型方法，统称为泛型。
        //作用：泛型提供了在编译阶段约束所能操作的数据类型，并自动进行检查的能力。这样可以避免强制类型转换，及其可能出现的异常。
        //本质：把具体的数据类型作为参数传给类型变量(e)。
        ArrayList list = new ArrayList();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        //list.add(new Cat());

        for (int i = 0; i < list.size(); i++) {
            String e = (String) list.get(i);
            System.out.println(e);
        }
        ArrayList<String> list1 = new ArrayList<String>();//jdk1.7开始，后面的数据类型可以不声明
        list1.add("java1");
        list1.add("java2");
        list1.add("java3");
        //list1.add(new Cat());
        for (int i = 0; i < list1.size(); i++) {
            String e = list1.get(i);
            System.out.println(e);
        }
    }
}