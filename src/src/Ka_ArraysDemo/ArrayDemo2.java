package Ka_ArraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //对数组中的对象进行排序
        Student[] students = new Student[4];
        students[0] = new Student("gs",170,18);
        students[1] = new Student("wqr",169,24);
        students[2] = new Student("diga",999,999);
        students[3] = new Student("nb",0,0);

        //方法一：让该对对象的类实现Comparable（比较规则）接口，重写compareTo方法，自己制定比较规则
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

        //方法二：使用sort方法，创建Comparator比较器接口的匿名内部类对象，然后自己制定比较规则。
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return (int) (o1.getAge()-o2.getAge());
//                if (o1.getHeight() > o2.getHeight()) {
//                    return 1;
//                }
//                else if (o1.getHeight() < o2.getHeight()) {
//                    return -1;
//                }
//                else return 0;
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });

        System.out.println(Arrays.toString(students));
    }
}
