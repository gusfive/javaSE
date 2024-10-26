package R_StreamDemo;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Student s1 = new Student("gs",18,185);
        Student s2 = new Student("ymy",24,165);
        Student s3 = new Student("gs",18,185);
        Student s4 = new Student("wqr",24,170);
        List<Student> ls = new ArrayList<Student>();
        Collections.addAll(ls,s1,s2,s3,s4);
        List<Student> ls1 = new ArrayList<Student>();
        Collections.addAll(ls1,s2,s4);
        //Stream流：流水线，操作集合或者数组的数据，结合了Lambda风格
        //数据源（集合/数组）————>获取Stream流————>数据处理（过滤、排序、去重等）————>获取处理的结果，收集到一个新结合中返回
        //获取集合的Stream流
        List<String> l1 = new ArrayList<>();
        Collections.addAll(l1,"gs","nb","虫棍少女超级有品");
        l1.stream();//Collection stream();

        Map<String,Integer> m1 = new HashMap<>();
        m1.put("gs",1);m1.put("gs",1);m1.put("虫棍少女超级有品",3);
        Set<Map.Entry<String,Integer>> entries = m1.entrySet();//Map集合：Set<Map.Entry<T,V>> entries = map.entrySet();键值对转为Set集合。
        entries.stream();

        //获取数组的Stream流
        int[] arr1 = {1,2,3};
        Arrays.stream(arr1);//Arrays: stream();
        Stream.of(arr1);//Stream类：of();

        //Stream流常用的中间方法（）
        System.out.println("filter");
        l1.stream().filter(s -> s.length() > 1).forEach(System.out::println);//filter() 按规则过滤
        System.out.println("sorted");
        l1.stream().sorted(((o1, o2) -> o1.length() - o2.length())).forEach(System.out::println);//sorted() 默认升序排序，可以自己重写规则
        System.out.println("limit");
        l1.stream().limit(2).forEach(System.out::println);//limit() 获取前几个元素
        System.out.println("skip");
        l1.stream().skip(2).forEach(System.out::println);//skip() 跳过前几个元素
        System.out.println("distinct");
        ls.stream().distinct().forEach(s -> System.out.println(s.toString()));//distinct() 去除流中重复的元素，判断对象的内容相同需要重写对象中的hashCode和equals方法
        System.out.println("map");
        ls.stream().map(s -> s.getName()).forEach(System.out::println);//map() 对元素加工，返回数据类型不一致的新流
        System.out.println("concat");
        Stream.concat(ls.stream(),ls1.stream()).forEach(System.out::println);//Stream.concat(Stream a,Stream b) 合并两个流为一个新流

        //Stream流中常见的终结方法
        ls.stream().forEach(System.out::println);//forEach 对此流运算后的元素进行遍历
        System.out.println(ls.stream().count());//count 统计此流运算后的元素个数
        System.out.println(ls.stream().max(((o1, o2) -> o1.getAge() - o2.getAge())));//max() 获取此流运算后的最大值元素
        System.out.println(ls.stream().min(((o1, o2) -> o2.getAge() - o1.getAge())));//min() 获取此流运算后的最小值元素

    }
}
