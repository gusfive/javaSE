package Q_CollectionFramework;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        /**TreeSet:不重复、无索引、可排序（默认升序排序，按照元素的大小，由小到大排序）
         * 底层是基于红黑树实现的排序。
         * 对于数值类型：Integer,Double,默认按照数值本身的大小进行升序排序
         * 对于字符串类型：默认按照首字符的编号升序排序。
         * 对于自定义类型如Student对象，TreeSet默认无法直接排序
         * 自定义排序规则：1.让自定义的类实现Comparable接口，重写里面的compareTo方法来指定比较规则。
         *              2.通过调用TreeSet集合有参数构造器，可以设置Comparator对象（比较器规则，用于指定比较规则）
         *          注意：如果类本身有实现Comparable接口，TreeSet集合同时也自带比较器，默认使用集合自带的比较器排序。
        */

//        Set<Student> ts = new TreeSet<>();
//        ts.add(new Student("gs",18));
//        ts.add(new Student("wqr",24));
//        ts.add(new Student("zero",0));
//        System.out.println(Arrays.toString(ts.toArray()));

//        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        Set<Student> students = new TreeSet<>(((o1, o2) -> o1.getAge()- o2.getAge()));
        students.add(new Student("gs",18));
        students.add(new Student("wqr",24));
        students.add(new Student("zero",0));
        System.out.println(Arrays.toString(students.toArray()));

    }
}
