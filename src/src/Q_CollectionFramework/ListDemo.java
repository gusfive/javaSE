package Q_CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //List集合支持索引，除此以外继承了Collection的功能
        List<String> l1 =new ArrayList<>();
        l1.add(0,"gs");//在此集合中的指定位置插入指定的元素
        l1.add(1,"wqr");
        l1.add(2,"nb");
        l1.add(1,"666");
        System.out.println(Arrays.toString(l1.toArray()));

        System.out.println(l1.remove(1));//删除指定索引处的元素，返回被删除的元素

        System.out.println(l1.set(1, "666"));//修改指定索引处的元素，返回被修改的元素

        System.out.println(l1.get(0));//返回集合中指定位置的元素
    }
}
