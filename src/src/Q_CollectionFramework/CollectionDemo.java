package Q_CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //Collection是单列集合的祖类，其中规定的方法是全部单列集合都会继承的。
        //集合中存储的是元素对象的地址。
        Collection<String> c = new ArrayList<>();

        //增
        c.add("java1");
        c.add("java2");
        c.add("java1");
        c.add("java2");
        c.add("java3");
        System.out.println(c);

        //清空
//        c.clear();
//        System.out.println(c);

        //判断是否为空
        System.out.println(c.isEmpty());

        //获取集合大小
        System.out.println(c.size());

        //判断集合中是否包含某个元素
        System.out.println(c.contains("java1"));

        //删除某个元素：如果有多个重复元素默认删除前面的第一个
        System.out.println(c.remove("java1"));
        System.out.println(c);

        //集合转换为数组
        Object[] o1 = c.toArray();
        System.out.println(Arrays.toString(o1));

        String[] arr = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr));

        //把一个集合的全部数据倒入到另一个集合中
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2);//直接加一个集合里全部元素
        System.out.println(c1);
        System.out.println(c2);
    }
}
