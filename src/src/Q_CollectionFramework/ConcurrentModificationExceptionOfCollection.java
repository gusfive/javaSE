package Q_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionOfCollection {
    /**集合的并发修改异常
     *      使用迭代器遍历集合时，又同时在删除集合中的数据，程序就会出现并发修改异常的错误
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("gs");
        list.add("wqr");
        list.add("nb");
        list.add("666");
        list.add("queshi");
        System.out.println(list);

//        //需求：找出集合中全部带“q”的名字，并从集合中删除
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String name = it.next();
//            if (name.contains("q")){
//                System.out.println(name);
//                list.remove(name);
//            }
//        }
        //上述代码会导致出现边删边改索引出现问题
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.contains("q")){
                System.out.println(name);
                //list.remove(name);
                it.remove();//删除迭代器当前遍历到的数据，每删除一个后，相当于在底层做了i--
            }
        }

        //或者倒序删除，删除元素后i--

        //注意，增强for循环和Lambda表达式没有办法处理这种并发修改问题

    }

}
