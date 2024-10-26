package M_MethodReferenceDemo;

import Ka_ArraysDemo.Student;

import java.util.Arrays;

public class MethodReferemceDemo {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("gs",170,18);
        students[1] = new Student("wqr",169,24);
        students[2] = new Student("diga",999,999);
        students[3] = new Student("nb",0,0);

        //静态方法的引用:如果某个Lambda表达式里只是调用一个静态方法，并且前后参数的形式一致，就可以使用静态方法引用。
        //类名：：静态方法
        //Arrays.sort(students,(o1, o2) -> {return Double.compare(o1.getHeight(),o2.getHeight());});
        //Arrays.sort(students,(o1,o2) -> CompareByData.compareByAge(o1,o2));
        Arrays.sort(students,CompareByData::compareByAge);

        //实例方法的引用：如果某个Lambda表达式里只是调用一个实例方法并且前后参数的形式一致，就可以使用实例方法引用。
        //对象名：：实例方法
        CompareByData cp = new CompareByData();
        //Arrays.sort(students,((o1, o2) -> cp.compareByAgeDesc(o1,o2)));
        Arrays.sort(students,cp::compareByAgeDesc);
        System.out.println(Arrays.toString(students));


    }
}
